package A4;
import java.io.*;

public class Q2 {
    public static void main(String[] args) throws IOException{
        viewHex("data.dat");
    }
    private static void viewHex(String filename) throws IOException{
        try{
            FileInputStream in = new FileInputStream(filename);
            DataInputStream dataIn = new DataInputStream(in);
            int length = in.available();
            String[] hexArray = new String[length];
            for(int i=0;i<length;i++){
                int b1 = dataIn.read();
                String s1 = Integer.toHexString(b1);
                if(s1.length() == 1){
                    s1 +=("0 ");
                }else{
                    s1 += " ";
                }
                hexArray[i] = s1;
            }
            dataIn.close();
            in.close();

            for(int count = 0;count<hexArray.length;count++){
                if(count % 16 == 0){
                    System.out.print("\n");
                }else if (count % 8 == 0){
                    System.out.print("|");
                }
                System.out.print(hexArray[count]);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
