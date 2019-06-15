package com.example.demo.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileScanner {

    public List<String> getFile(String filePath){
        List<String> nr = new ArrayList<>();
        File file = new File(filePath);
        System.out.println("核实路径"+file);
        String line = "";
        if(file.exists()){
            InputStreamReader reader = null;
            try {
                reader = new InputStreamReader(new FileInputStream(file));
                BufferedReader br = new BufferedReader(reader);
                System.out.println("--读取的内容--");
                while(line != null){
                    line = br.readLine();
                    System.out.println(line);
                    //return line;
                }
                System.out.println("--读取的内容--");

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            System.err.println("文件不存在！");
            fileCreate(filePath);
        }

        return nr;
    }

    public void fileCreate(String filePath){
        System.out.println("正在创建文件夹文件。。。");
        String path = filePath+"\\TestFile\\";

        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("file---->"+file);
            try {
                System.out.println("开始写文件！！！");
                fileWrite(file);
                System.out.println("文件完成！！！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //file.mkdirs();//创建多级文件夹

    }

    public StringBuilder fileWrite(File file) throws Exception {
        StringBuilder text = null;
        String line = "I Love You!";
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder=new StringBuilder(line);
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        try {
            System.out.println("--stringBuilder--"+stringBuilder);
            text = stringBuilder.insert(11,"|");
            System.out.println(text);
            for (int j = 0 ;j < 10; j++ ) {
                //bw.append("|");
                //bw.write(line);
                for(int i = 0;i<8;i++){
                    //bw.append(line);
                    bw.write(String.valueOf(text));
                    //bw.append("|");
                    System.out.println("bw:"+ bw);

                }
                bw.newLine();
                //bw.append("\r\n");
            }

            System.out.println("-内容-"+text);
            System.out.println("写文件完成！！！");
            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bw.flush();
            bw.close();
        }
        return text;
    }

    public boolean rmfile(String filePath){
        boolean flag = false;
        File f = new File(filePath);
        System.err.println("准备删除的文件夹及文件："+filePath);
        try{
            if(f.exists()){
                //rmfile(filePath);
                f.delete();
                flag = true;
            }else{
                System.err.println("删除失败！");
                return flag;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Mickey\\Documents\\2019test.txt";
        FileScanner fs = new FileScanner();
        //fs.rmfile(filePath);//删除文件
        fs.getFile(filePath);//文件生成
    }
}
