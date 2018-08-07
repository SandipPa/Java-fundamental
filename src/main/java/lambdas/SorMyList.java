package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class SorMyList {
  public static void showAll(List l) {
    for (Object o : l) System.out.println(o);
    System.out.println("-----------------------");
  }

  public static void main(String[] args) {
    List<String> ls = new ArrayList<>();
    ls.add("Sheila");
    ls.add("Fred");
    ls.add("Jim");
    showAll(ls);

//    Comparator<String> alpha = new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o1.compareTo(o2);
//      }
//    };
//    ls.sort(new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o1.compareTo(o2);
//      }
//    });
//    ls.sort(/*new Comparator<String>() { */
//      /*@Override
//      public int compare*/(String o1, String o2) -> {
//        return o1.compareTo(o2);
//      }
//    /*}*/);
//    ls.sort((String o1, String o2) -> {
//        return o1.compareTo(o2);
//      });
//    ls.sort((o1, o2) -> {
//        return o1.compareTo(o2);
//      });
//    ls.sort((o1, o2) -> o1.compareTo(o2));
    ls.sort(String::compareTo);
    showAll(ls);
  }
}
