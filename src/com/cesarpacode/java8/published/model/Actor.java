package com.cesarpacode.java8.published.model;

public interface Actor {
    void act();

    void speak();

    default void doComedy() {
        System.out.println("doing some comedy");
    }
}
