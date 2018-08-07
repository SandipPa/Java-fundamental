package nested;

import java.lang.reflect.Array;
import java.util.Iterator;

public class MyList<E> implements Iterable<E> {
//    private Class<E> clazz = null;
//    private E[] data = (E[])Array.newInstance(clazz, 10);
    @SuppressWarnings("unchecked")
    private E [] data = (E[])(new Object[10]);
    private int count = 0;
    
    public void add(E e) {
        data[count++] = e;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyList [");
        for (int i = 0; i < count; i++) {
            sb.append(data[i]);
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append(" ]");
        return sb.toString();
    }
    
//    private class MyIterator implements Iterator<E> {
//        private int progress = 0;
//
//        @Override
//        public boolean hasNext() {
//          return progress < count - 1;
//        }
//
//        @Override
//        public E next() {
//          return data[progress++];
//        }
//
//    }
//    @Override
//    public Iterator<E> iterator() {
////        return new MyList<String>().new MyIterator<>();
//        return new MyIterator();
//    }
    @Override
    public Iterator<E> iterator() {
//        return new MyList<String>().new MyIterator<>();
        return new /*MyIterator();
      private class MyIterator implements */ Iterator<E>() {
        private int progress = 0;

        @Override
        public boolean hasNext() {
          return progress < count - 1;
        }

        @Override
        public E next() {
          return data[progress++];
        }
      };
    }
}
