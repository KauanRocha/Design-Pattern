package org.lab.singleton;

public class SingletonLazyHolder {

    private static class Holder {
        public static SingletonLazyHolder singletonLazyHolder = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return Holder.singletonLazyHolder;
    }
}
