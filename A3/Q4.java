
import java.io.*;
import java.util.*;

public class Q4 {
    public static void main(String[] args) throws IOException{
        String censoredWords[] = {"ABC","XYZ"};
        //add code (1)
        File file = new File("c:/Users/coope/Programming/COSC121Assignments/A3/source.txt");
        FileWriter fw = new FileWriter("c:/Users/coope/Programming/COSC121Assignments/A3/destination.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            line = replaceCensoredWords(line, censoredWords);
           // System.out.println(line);
            line = line.toUpperCase();
            pw.println(line);
            pw.flush();
        }
        pw.close();
        fw.close();
        bw.close();
        sc.close();

    }
    public static String replaceCensoredWords(String line, String[] censoredWords){
        //add code (2)
        Scanner input = new Scanner(line);
        while(input.hasNextLine()){
            String word = input.next();
            for(int i=0;i<censoredWords.length;i++){
                if(word.equalsIgnoreCase(censoredWords[i])){
                    line = line.replace(word, "...");
                }
            }
        }
        input.close();
        return line;
    }
}
