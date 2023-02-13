package COSC121Assignments.A3;

import java.util.Scanner;

public class ExceptionHandledQ1 {
    public static void main(String[] args){
        int[] numbers = new int[50];
        for(int i = 0;i<numbers.length;i++){
            numbers[i] = (int) (Math.random()*50);
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Index: ");
        int index = in.nextInt();

        while(true){
            try{
                System.out.println("The element is: "+numbers[index]);
                break;
            }
            catch(IndexOutOfBoundsException e){
                System.out.print("Out of Bounds. Try Again: ");
                index = in.nextInt();
            }
        }
    }
}
