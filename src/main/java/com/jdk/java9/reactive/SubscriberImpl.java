package com.jdk.java9.reactive;

import java.util.concurrent.Flow;

// TODO: Implement the Subscriber interface
public class SubscriberImpl implements Flow.Subscriber {
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void onNext(Object item) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void onError(Throwable throwable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void onComplete() {
        throw new UnsupportedOperationException();
    }
}
