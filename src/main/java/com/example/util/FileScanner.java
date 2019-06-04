package com.example.util;

import java.io.*;

public class FileScanner {

    public void getFile(String filePath){
        File file = new File(filePath);
        System.out.println("核实路径"+file);
        if(file.exists()){
            String line = "";
            InputStreamReader reader = null;
            try {
                reader = new InputStreamReader(new FileInputStream(file));
                BufferedReader br = new BufferedReader(reader);

                while(line != null){
                    line = br.readLine();
                    System.out.println(line);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            System.err.println("文件不存在！");
            file(filePath);
        }
    }

    public void file(String filePath){
        System.out.println("正在创建文件夹文件。。。");
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("file---->"+file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //file.mkdirs();//创建多级文件夹

    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Mickey\\Documents\\0123abc.txt";
        System.out.println("filePath:"+filePath);
        FileScanner fs = new FileScanner();
        fs.getFile(filePath);
    }
}
