package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        Random r = new Random();
        for(int i=0;i<10000;i++) {
            int rr = r.nextInt(10000);
            arrayList.add(rr);
            treeSet.add(rr);
        }

        long start = System.nanoTime();
        for(int i=0;i<10000;i++) {
            arrayList.contains(i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList contains: "+ (end-start));

        start = System.nanoTime();
        for(int i=0;i<10000;i++) {
            treeSet.contains(i);
        }
        end = System.nanoTime();
        System.out.println("TreeSet contains:   "+ (end-start));



        
    }
}
