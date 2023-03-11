package A5;

import java.util.Scanner;

public class Q2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = in.nextLine();
        reverse(str);
    }
    static void reverse(String str, int idx, int idx1){
        char[] chls = new char[str.length()];
        if(idx<0&&idx1>str.length()-1){
            return;
        }else{
            chls[idx1] = str.charAt(idx);
            System.out.print(chls[idx1]);
            reverse(str,idx-1,idx1+1);
        }
    }
    static void reverse(String str){
        int index = str.length()-1;
        int id = 0;
        reverse(str,index,id);
    }
}