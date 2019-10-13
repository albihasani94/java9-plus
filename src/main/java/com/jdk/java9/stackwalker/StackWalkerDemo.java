package com.jdk.java9.stackwalker;

import java.util.List;
import java.util.stream.Collectors;

public class StackWalkerDemo {

    public static void main(String[] args) {

        // Before Java 9; low performance
        /*StackTraceElement[] stackTraceThrowable = new Throwable().getStackTrace();
        StackTraceElement[] stackTraceThread = Thread.currentThread().getStackTrace();*/

        // With Java 9 //Handling all StackFrames
        StackWalker walker = StackWalker.getInstance();
        walker.forEach(System.out::println);

        // Handling specific StackFrames
        List<Integer> lines = walker.walk(stackFrameStream ->
                stackFrameStream.filter(frame -> frame.getMethodName().startsWith("m"))
                        .map(StackWalker.StackFrame::getLineNumber)
                        .collect(Collectors.toList())
        );
        lines.forEach(System.out::println);

    }

}
