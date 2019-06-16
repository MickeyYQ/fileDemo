package com.example.demo.controller;

import com.example.demo.pojo.Filefold;
import com.example.demo.repository.FileRepository;
import com.example.demo.util.DateTime;
import com.example.demo.util.FileScanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class sannerController {

    @Autowired
    private FileRepository fileRepository;

    @RequestMapping("/index")
    public String insertAll(){
        DateTime dt = new DateTime();
        Filefold f = new Filefold();
        List<String> list ;
        List<String> listb = new ArrayList<String>();
        List<Filefold> ffd = new ArrayList<>();
        FileScanner fs = new FileScanner();

        list = fs.getFile("C:\\Users\\Mickey\\Documents\\2019test.txt");
        System.out.println("list----->" + list);

        if (list != null || list.size() > 0){
            //list.remove("null");
            //System.out.println("list----->" + list);
            for(String s : list){
                System.out.println(dt.date()+" s-->>>>>>"+s);
                if(s.equals("null")){
                    list.remove(s);
                    //return s.toString().replace("null","");
                }else{
                    s = s.substring(0,s.length() - 1);
                    System.out.println("修改后的s "+s);
                    //将list： I Love You!|I Love You!|I Love You!|I Love You!|I Love You!|I Love You!|I Love You!|I Love You!|转换为8个
                    String[] sb = s.split("\\|");
                    System.out.println("sb---- "+sb.length+" ---- "+sb);
                    //System.out.println(String.valueOf(sb));
                    listb.addAll(Arrays.asList(sb));
                    //listb.add(String.valueOf(sb));
                    for (String a:sb) {
                        System.out.println("a--- "+a);
                        listb.add(a);
                    /*for(String c : listb){
                        System.out.println("c-- "+c);

                    }*/
                        //  System.out.println("listb---- "+listb);

                    }
                    System.out.println("listb---- "+listb);
                    System.out.println("listb---- "+listb.size());


                }

            }
        /*System.out.println("ffd--- "+ffd.size());
        for(Filefold fl : ffd){
            System.out.println("fl--- "+fl+ffd.size());
        }*/
            for(int a = 0 ;a<listb.size();a++){
                f.setFilenamea(listb.get(0));
                f.setFilenameb(listb.get(1));
                f.setFilenamec(listb.get(2));
                f.setFilenamed(listb.get(3));
                f.setFilenamee(listb.get(4));
                f.setFilenamef(listb.get(5));
                f.setFilenameg(listb.get(6));
                f.setFilenameh(listb.get(7));
                ffd.add(f);
                //fileRepository.saveAll(ffd);
            /*if(list.equals("") || list == null || list.equals("null")){
                list.clear();
            }else{

            }*/
            }
            System.out.println("ffd---- "+ffd.size());
            for(Filefold filefold : ffd){
                System.out.println("filefold---- "+filefold.getFilenamea());
                System.out.println("filefold---- "+filefold.getFilenameb());
                System.out.println("filefold---- "+filefold.getFilenamec());
                System.out.println("filefold---- "+filefold.getFilenamed());
                System.out.println("filefold---- "+filefold.getFilenamee());
                System.out.println("filefold---- "+filefold.getFilenamef());
                System.out.println("filefold---- "+filefold.getFilenameg());
                System.out.println("filefold---- "+filefold.getFilenameh());
                System.out.println("-------------------------------");
            }
            fileRepository.saveAll(ffd);
            return "TMD！";
        }else {
            return "Error！";
        }

    }
}
