package com.cdisciple.practice;

public class Counter {
    private int value = 0;
    private String name;

    public Counter(String name){
        this.name = name;
    }
    public void increment(){
        value++;
    }
    public int getCurrentValue(){
        return value;
    }
    public String toString(){
        return "The " + name +" Counter object has a value of " +value;
    }
}
