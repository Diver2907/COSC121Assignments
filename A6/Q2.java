package A6;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
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
        ArrayList<String> sentences = new ArrayList<String>();
        in.useDelimiter("[.:!?]");
        boolean s;
        String sentence;
        while((s = in.hasNext()) == true){
            sentence = in.next();
            sentences.add(sentence.trim().concat("."));
        }
        System.out.println("-=====Initial=====-");
        for(int i=0;i<sentences.size();i++){
            System.out.println(sentences.get(i));
        }
        
        System.out.println("-=====Shuffled=====-");
        Collections.shuffle(sentences);
        for(int i=0;i<sentences.size();i++){
            System.out.print(sentences.get(i));
        }
    }
}
