package com.company;

public interface IHealth {
    void down();

    default void Up(){
        System.out.println("Become stronger");
    }
}
