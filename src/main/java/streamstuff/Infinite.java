package streamstuff;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class Infinite {
  public static void main(String[] args){
    DoubleStream.iterate(1, x -> x + 1)
    .limit(1000)
        .forEach(System.out::println)
    ;

    double quarterPi =
        Stream.<int[]>iterate(new int[]{1, +1}, x -> new int[]{x[0] + 2, -x[1]} )
//        .peek(p -> System.out.println(p[0] + ", " + p[1]))
        .mapToDouble(x -> 1.0/(x[0] * x[1]))
        .limit(1_000_000)
        .sum();

//    .forEach(System.out::println);

    System.out.println("Pi is approximately " + (4 * quarterPi));
  }
}
