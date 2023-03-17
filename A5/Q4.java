package A5;

import java.io.File;
import java.util.ListResourceBundle;

public class Q4 {
    public static void main(String[] args){
        listAllFiles("c:/");
    }
    public static void listAllFiles(File dir, String spaces){
        File[] fileList = dir.listFiles();
        if(f==null){
            return;
        }
        else{
            for(File f1:fileList){
                if(f1.isFile()){
                    System.out.println(spaces+f1.getName());
                }else if(f1.isDirectory()){
                    System.out.println("["+f1.getAbsolutePath().toUpperCase()+"]");
                    listAllFiles(f1,spaces+ " ");
                }else{
                    return;
                }
            }
        }
    }
    public static void listAllFiles(File dir){
        listAllFiles(dir,"" );
    }
}