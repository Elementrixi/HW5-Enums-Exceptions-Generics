package main.java.com.hwnumber5;

import main.java.com.hwnumber5.list.LowHighElem;
import main.java.com.hwnumber5.list.MyList;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> integerMyList = new MyList<>();
        integerMyList.add(124);
        integerMyList.add(128);
        integerMyList.add(148);
        integerMyList.add(104);
        integerMyList.add(10);

        MyList<String> stringMyList = new MyList<>();
        stringMyList.add("Aa");
        stringMyList.add("aA");
        stringMyList.add("ab");
        stringMyList.add("abc");
        stringMyList.add("abcd");

        System.out.println("The largest integer value is : " + integerMyList.getMax());
        System.out.println("The smallest integer value is : " + integerMyList.getMin() + "\n");

        System.out.println("The largest string value is : " + stringMyList.getMax());
        System.out.println("The smallest string value is : " + stringMyList.getMin() + "\n");

        Integer[] elemList = {12,34,23,56,67,98};
        LowHighElem<Integer> myList = new LowHighElem<>(elemList);
        System.out.println("The biggest element : " + myList.getBiggest());
        System.out.println("The smallest element : " + myList.getMin());
    }
}


