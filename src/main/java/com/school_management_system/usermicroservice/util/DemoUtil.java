package com.school_management_system.usermicroservice.util;

final class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class DemoUtil {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            Singleton instance1 = Singleton.getInstance();
            System.out.println(instance1.hashCode());
        });

        Thread thread2 = new Thread(() -> {
            Singleton instance2 = Singleton.getInstance();
            System.out.println(instance2.hashCode());
        }) ;

        thread1.start();
        thread2.start();
    }
}
