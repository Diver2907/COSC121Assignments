package COSC121Assignments.A3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        double num1;
        char operator;
        double num2;

        System.out.print("Enter a simple mathematical formula\nExample: 4.5 + 5.3\nEnter: ");

        while(true){
            try{
                num1 = in.nextDouble();
                operator = in.next().charAt(0);
                num2 = in.nextDouble();
                switch(operator){
                    case '+':
                        System.out.println("Result: "+(num1+num2));
                        break;
                    case '-':
                        System.out.println("Result: "+(num1-num2));
                        break;
                    case '*':
                        System.out.println("Result: "+(num1*num2));
                        break;
                    case '/':
                        System.out.println("Result: "+(num1/num2));
                        break;
                    default:
                        System.out.println("Invalid operator. Try again");
                        break;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid number format. Try again");
                in.nextLine();
            }
        }
        
    }
    
}
