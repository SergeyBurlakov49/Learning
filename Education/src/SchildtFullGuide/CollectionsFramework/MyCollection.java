package SchildtFullGuide.CollectionsFramework;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

/** ваще не готово, просто чекал, как итератор работает */

public class MyCollection <T> implements Iterable<T> {

    public T[] arr;

    @SuppressWarnings("unchecked")
    public MyCollection(Class<T> clazz){
        this.arr = (T[]) Array.newInstance(clazz,10);
    }

    @SuppressWarnings("unchecked")
    public MyCollection(Class<T> clazz, int capacity){
        this.arr = (T[]) Array.newInstance(clazz, capacity);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T>{

        int position;

        private MyIterator(){
            position = -1;
        }

        @Override
        public boolean hasNext() {
            return ((position + 1) < arr.length && arr[position + 1] != null);
        }

        @Override
        public T next() {
            position++;
            return arr[position];
        }

        @Override
        public void remove() {
            arr[position] = null;
        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {
            while (this.hasNext()){
                action.accept(next());
            }
        }


    }
}
