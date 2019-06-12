package com.example.demo.util;

import java.util.UUID;

public class Test {


    public String getUid(){
        String a = null;
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
        return a;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.getUid();
    }
}
