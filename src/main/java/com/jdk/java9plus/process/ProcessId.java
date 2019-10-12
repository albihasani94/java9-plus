package com.jdk.java9plus.process;

import java.lang.management.ManagementFactory;

public class ProcessId {

    public static void main(String[] args) {

        // Before Java 9
        long pid = Long.parseLong(ManagementFactory.getRuntimeMXBean().getName().split("@")[0]);
        System.out.println("Process id: " + pid);

        // With ProcessHandle in Java 9
        long pid2 = ProcessHandle.current().pid();
        System.out.println("Process id: " + pid2);


    }

}
