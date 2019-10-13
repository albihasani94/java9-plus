package com.jdk.java9.language;

import java.util.ArrayList;
import java.util.List;

public class GenericInference {

    List<String> list = new ArrayList<String>(); // Java 5
    List<String> list2 = new ArrayList<>(); // Java 7
    List<String> list3 = new ArrayList<>() { // In Java 8: cannot infer type arguments for ArrayList<E>
        @Override                            // In Java 9: diamond operator can be used with anonymous inner classes
        public boolean add(String s) {
            System.out.println("Adding " + s);
            return super.add(s);
        }
    };

}
