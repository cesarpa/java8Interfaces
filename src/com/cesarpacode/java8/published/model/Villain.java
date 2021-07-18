package com.cesarpacode.java8.published.model;

public class Villain implements Actor{
    @Override
    public void act() {
        System.out.println("rob as villain");
    }

    @Override
    public void speak() {
        System.out.println("with super presentation");
    }

    public void rude(){
        System.out.println("is rude");
    }
}
