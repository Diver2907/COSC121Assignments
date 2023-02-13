package COSC121Assignments.A3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        double num1;
        String operator;
        double num2;
        System.out.print("Enter a simple mathematical formula\nExample: 4.5 + 5.3\nEnter: ");
        while (true){
            try{
                num1 = in.nextDouble();
                operator = in.next();
                num2 = in.nextDouble();
                switch(operator){
                    case "+":
                        System.out.println("Result: "+(num1+num2));
                    case "-":
                        System.out.println("Result: "+(num1-num2));
                    case "*":
                        System.out.println("Result: "+(num1*num2));
                    case "/":
                        System.out.println("Result: "+(num1/num2));
                    default:
                        System.out.print(-1);
                }
            }
            catch(InputMismatchException e){
                System.out.println("Error with input. Try again:");
                num1 = in.nextDouble();
                operator = in.next();
                num2 = in.nextDouble();
            }  
        }     
    }
}
