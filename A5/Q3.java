package A5;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        str = str.toLowerCase();
        System.out.print("Enter a character: ");
        String character = in.next();
        character = character.toLowerCase();
        char ch = character.charAt(0);

        System.out.println(ch+" appears "+charCount(str,ch)+" time(s) in "+str);
    }
    public static int charCount(String str, char ch){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char char1 = str.charAt(i);
            if(char1 == ch){
                count += 1;
            }
        }
        return count;
    }
}
