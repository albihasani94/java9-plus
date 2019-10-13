package com.jdk.java9.reactive;

import java.util.concurrent.Flow;

// TODO: Implement the Subscription interface
public class Sub implements Flow.Subscription {
    @Override
    public void request(long n) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void cancel() {
        throw new UnsupportedOperationException();
    }
}
