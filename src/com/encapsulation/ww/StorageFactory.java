package com.encapsulation.ww;

public class StorageFactory {
    public static Storage generate(){
        return new StorageImpl();
    }

    public static void main(String[] args) {
        Storage a=StorageFactory.generate();
        a.add("Hello");
        a.show();
        a.ww();
    }
}
