package org.lab.singleton;

public class SingletonLazy {

    private static SingletonLazy singletonLazy;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if(singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }

        return singletonLazy;
    }
}
