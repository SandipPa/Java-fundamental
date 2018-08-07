package streamstuff;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

public final class Concordance {
  private static final Pattern WORD_BOUNDARY = Pattern.compile("\\W+");
//  private static final Comparator<Map.Entry<String, Long>> normalOrdering =
////      (e1, e2) -> Long.compare(e2.getValue(), e1.getValue());
//    Map.Entry.comparingByValue();
//  private static final Comparator<Map.Entry<String, Long>> ordering = normalOrdering.reversed();
  public static void main(String[] args) {
    try (Stream<String> input = Files.lines(Paths.get("PrideAndPrejudice.txt"))) {
      input
          .flatMap(WORD_BOUNDARY::splitAsStream)
          .filter(w -> w.length() > 0)
          .map(String::toLowerCase)
//          .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
          .entrySet().stream()
//          .sorted(ordering)
          .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
          .limit(200)
          .map(e -> String.format("%20s : %5d", e.getKey(), e.getValue()))
          .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
