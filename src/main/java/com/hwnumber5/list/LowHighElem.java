package main.java.com.hwnumber5.list;

public class LowHighElem<T extends Comparable<? super T>> {
    private T[] elemList;

    public LowHighElem(T[] array) {
        this.elemList = array;
    }
    public T getBiggest() {
        T max = elemList[0];
        for (T t : elemList) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }
    public T getMin(){
        T min = elemList[0];
        for (T t: elemList) {
            if (t.compareTo(min) < 0){
                min = t;
            }
        }
        return min;
    }
}
