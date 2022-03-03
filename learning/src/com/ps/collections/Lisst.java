package com.ps.collections;

import java.util.*;

public class Lisst {
    public static void main(String[] args) {
//        List<String> l= new ArrayList<>();
//        l.add("hi");
//        System.out.println(l);
//        System.out.println(l.get(0));
//        l.add("bye");
//        l.add("kishore");
//        l.add("ganesh");
//        System.out.println(l);
//        System.out.println(l.size());
////        l.addAll();
//        System.out.println(l.subList(0,3));
//        List<String> l1=List.of("1","2","3");
//        System.out.println(l1);
//        Iterator<String> iterl=l.iterator();
//        while (iterl.hasNext()){
//            String item = iterl.next();
//            System.out.println(item);
//        }
////        String[] copy=l1.toArray();
//
//        for (int i = 0; i <l1.size() ; i++) {
//            System.out.println(l1.get(i));
//
//        }
//
//        Set<String> s1=new HashSet();
//        s1.add("hi");
//        s1.add("hello");
//        s1.add("bye");
//        Iterator<String> iters=s1.iterator();
//        while (iters.hasNext()){
//            String item=iters.next();
//            System.out.println(item);
//        }
//        System.out.println(s1.contains("hi"));

        SortedSet<String> ts = new TreeSet<>();
        ts.add("hi");
        ts.add("bye");
        System.out.println(ts.first());
        System.out.println(ts.last());
        Iterator<String> iterts = ts.iterator();
//        while (iterts.hasNext()) {
//            String item = iterts.next();
//            System.out.println(item);
//        }

    }
}

