package com.aptech.helpers;

import javax.servlet.ServletContext;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MediaHelper {
    private ServletContext myContext;

    public MediaHelper(ServletContext context){
        this.myContext=context;
    }


    //all media files
    public  List<String> getMediaList() {
        List<String> allFileList = new ArrayList<>();

        String root = myContext.getRealPath("/");
        File path = new File(root + "/uploads");

        File[] allFiles = path.listFiles();
        if (allFiles != null) {
            for (File f : allFiles) {
                allFileList.add(f.getName());
//                System.out.println(f.getName());
            }
        }

        return allFileList;
    }

    //delete media
    //delete media file
    public  boolean deleteMedia(String imageName) {
        boolean status = false;
        String root = myContext.getRealPath("/");
        String path=root + "/uploads";
        File file = new File(path);
        if (file.exists()) {
            String[] filename = file.list();
            for (String name : filename) {
                if (name.equals(imageName)) {
                    File myFile = new File(path + "\\" + name);
                    myFile.delete();
                    status = true;
                    System.out.println(name + " is deleted");
                }
//                System.out.println(name);
            }
        } else {
            System.out.println("no such a file");
        }
        return status;
    }
}
