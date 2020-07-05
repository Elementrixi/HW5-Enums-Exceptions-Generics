package main.java.com.hwnumber5.list;

import java.util.ArrayList;
import java.util.Collections;

public class MyList<T extends Comparable<? super T>> {
    private ArrayList<T> list;

    public MyList() {
        this.list = new ArrayList<>();
    }

    public void add(T addList) {
        list.add(addList);
    }

    public T getMax() {
        return Collections.max(list);
    }

    public T getMin() {
        return Collections.min(list);
    }
}
