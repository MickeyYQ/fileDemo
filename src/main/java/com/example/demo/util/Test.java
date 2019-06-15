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

        String[] aa = "aaa|bbb|ccc".split("|");
        String[] ab = "aa a|bb b|cc c".split("\\|"); //这样才能得到正确的结果
        for (int i = 0 ; i <ab.length ; i++ ) {
            //System.out.println("--"+aa[i]);
            System.out.println("--"+ab[i]);
        }
    }
}
