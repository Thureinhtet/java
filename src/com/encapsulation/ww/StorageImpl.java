package com.encapsulation.ww;

import java.util.Arrays;

public class StorageImpl implements Storage{
    Storage storage;

    String [] array={};
    @Override
    public boolean add(String message) {
        if (message!=null){
            array= Arrays.copyOf(array,array.length+1);
            array[array.length-1]=message;
            return true;
        }
        return false;
    }

    @Override
    public void show() {
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    @Override
    public void ww() {
        System.out.println("abstract method");
    }

}
