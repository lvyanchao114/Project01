package com.jnmd.java;

import java.util.ArrayList;
import java.util.List;

public class helloWord {

    public static void main(String[] args) {
        System.out.println("hello word");
        String[] arr=new String[]{"Tom","Jerry","Hmm","lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-------------------------------");
        List<String> list=new ArrayList();
        list.add("tom");
        list.add("Jerry");
        list.add("Lilei");

        for (String a :
                list) {
            System.out.println(a);
        }
        System.out.println("-------------------------------");

    }
}
