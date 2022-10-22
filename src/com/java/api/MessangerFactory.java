package com.java.api;

public class MessangerFactory {
    public static Messanger generate(){
        return new MessengerImpl();
    }

    public static void main(String[] args) {
        Messanger m=MessangerFactory.generate();
        m.send("Thurein Htet");

    }
}
