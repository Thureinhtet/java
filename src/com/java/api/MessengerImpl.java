package com.java.api;

class MessengerImpl implements Messanger{
    @Override
    public void send(String name) {
        System.out.println("Hello "+name);
    }
    public void greet(){
        System.out.println("Hello");
    }
}
