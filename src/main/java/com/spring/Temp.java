package com.spring;

public class Temp {
    public void print(Msg msg){
        System.out.println(msg.getId());
        System.out.println(msg.getName());
    }
    public void stringPrint(String a){
        System.out.println(a);
    }
//    public static void main(String[] args) {
//        Msg msg = new Msg();
//        msg.setId("song");
//        msg.setName("송혜교");
//
//        print(msg);
//
//        String message = "message";
//        stringPrint(message);
//    }
}
