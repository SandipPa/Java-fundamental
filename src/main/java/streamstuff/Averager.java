package streamstuff;

import java.util.OptionalDouble;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.DoubleStream;

class Average {
  private double sum = 0;
  private long count = 0;

  public Average() {}

  public void include(double val) {
    sum += val;
    count++;
  }

  public void merge(Average other) {
    this.sum += other.sum;
    this.count += other.count;
  }

  public OptionalDouble get() {

    return (count > 0)
      ? OptionalDouble.of(sum / count)
      : OptionalDouble.empty();
  }
}

public final class Averager {
  public static void main(String[] args) {
    long start = System.nanoTime();

    DoubleStream.generate(() -> ThreadLocalRandom.current().nextDouble(-Math.PI, Math.PI))
        .limit(400_000_000)
//        .map(x -> Math.sin(x))
        .map(Math::sin)
        .parallel()
//        .collect(() -> new Average(), (a, v) -> a.include(v), (a1, a2) -> a1.merge(a2))
        .collect(Average::new, Average::include, Average::merge)
        .get()
        .ifPresent(x -> System.out.println("Average is " + x));
//        .forEach(System.out::println);
    long time = System.nanoTime() - start;
    System.out.printf("Completed in %9.6f seconds\n", (time / 1_000_000_000.0));
  }
}
