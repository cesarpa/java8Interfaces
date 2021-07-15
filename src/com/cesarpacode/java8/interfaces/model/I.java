package com.cesarpacode.java8.interfaces.model;

public interface I {
    default void show() {
        System.out.println("I");
    }

    static void showStatic(){
        System.out.println("Static method on Interface");
    }
}

