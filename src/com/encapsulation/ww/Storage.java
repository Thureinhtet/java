package com.encapsulation.ww;

interface Storage {
    boolean add(String message);
    void show();
    static int ok=2;
     static void greet(){
        System.out.println("Hello");
    }
    abstract void ww();


}
