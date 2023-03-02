package A4;
import java.io.*;


public class Q1 {
    public static void main(String[] args) throws IOException{
        int count = 0;
        FileInputStream in = new FileInputStream("c:/Users/coope/Programming/COSC121Assignments/A4/count.dat");
        if(in.available() == 0){
            count = 1;
        }else{
            count = in.read();
            count ++;
        }
        System.out.println(count);
        FileOutputStream out = new FileOutputStream("c:/Users/coope/Programming/COSC121Assignments/A4/count.dat");
        out.write(count);
        in.close();
        out.close();
    }
}
