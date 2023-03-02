package A4;
import java.io.*;

public class BackupRestore {
    public static int backup(String filename, double partSize){
        double size = partSize;
        String name = filename;
        int len = name.length();
        String name1 = name.substring(0,len-4);
        String type = name.substring(1-4,1);
        int num = 0;
        try{
            FileInputStream in = new FileInputStream(name);
            num = (int) (Math.ceil(((in.available()))/0.000001)/size);
            for(int i = 0; i<num; i++){
                String fName = name1 +"."+i+type;
                File f = new File(fName);
                FileOutputStream out = new FileOutputStream(fName);
                while(in.available()<size){
                    var n = in.read();
                    out.write(n);
                }
                in.close();
                out.close();
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
            num = -1;
        }
        catch(IOException e){
            System.out.println("An error occured");
            num = -1;
        }
        return num;
    }
    public static int restore(String filename, int numberOfPieces) throws IOException{
        String name = filename;
        int len = name.length();
        String name1 = name.substring(0,len-4);
        String type = name.substring(1-4,1);
        int len1 = name1.length();
        char num = name1.charAt(len1);
        int size = -1;
        int number = (int) num;
        for(int i=0;i<numberOfPieces;i++){
            String name2 = name1+"."+i+type;
            try{
                FileInputStream in = new FileInputStream(name2);
                FileOutputStream out = new FileOutputStream(name);
                out.write(in.read());
                int fileSize = in.available();
                size++;
                size += fileSize;
                out.close();
                in.close();
            }
            catch(FileNotFoundException e){
                System.out.println("File not found");
                size = -1;
            }
        }
        return size;
    }
}
