package com.cesarpacode.java8.published.model;

public class Hero implements Actor{

    @Override
    public void act() {
        System.out.println("use superpowers");
    }

    @Override
    public void speak() {
        System.out.println("uses super voice");
    }

    public void doComedy(){
        System.out.println("que mamada es el mejor nombre de la vida :v");
    }
}
