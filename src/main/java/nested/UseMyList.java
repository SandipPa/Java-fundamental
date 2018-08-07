package nested;

import java.util.Iterator;

public final class UseMyList {
  public static void main(String[] args) {
    MyList<String> mls = new MyList<>();
    mls.add("Fred");
    mls.add("Jim");
    mls.add("Sheila");

    System.out.println("> " + mls);

    for (String s : mls) {
      System.out.println("-- " + s);
    }

    Iterator<String> a = mls.iterator();
    Iterator<String> b = mls.iterator();

    System.out.println("a : " + a.next());
    System.out.println("a : " + a.next());
    System.out.println("b :               " + b.next());
    System.out.println("a : " + a.next());
    System.out.println("b :               " + b.next());
    System.out.println("b :               " + b.next());
  }

}
