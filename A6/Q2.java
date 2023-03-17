package A6;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) throws IOException{
        String filename = "c:/Users/coope/Programming/COSC121Assignments/A6/story.txt";
        printShuffled(filename);
    }
    public static void printShuffled(String filename) throws IOException{
        FileReader fr = new FileReader(filename);
        BufferedReader file = new BufferedReader(fr);
        Scanner in = new Scanner(file);
        in.useDelimiter("[.:!?]");
        String s;
        int sentenceCount = 0;
        while((s = in.next())!=null){
            sentenceCount += 1;
            System.out.println(s);
        }
        ArrayList<String> sentences = new ArrayList<String>(sentenceCount);

    }
}
