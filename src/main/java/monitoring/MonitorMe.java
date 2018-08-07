package monitoring;

public class MonitorMe {
    public static void main(String[] args) throws Throwable {
        for(;;) {
            int [] ia = null;
            Thread.sleep((int)(Math.random() * 100));
            for (int i = 0; i < 10; i++)
                ia = new int[10_000];
        }
    }
}
