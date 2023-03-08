import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String num1;
        char operator;
        String num2;

        System.out.print("Enter a simple mathematical formula\nExample: 4.5 + 5.3\nEnter: ");

        while(true){
            try{
                num1 = in.next();
                operator = in.next().charAt(0);
                num2 = in.next();
                double num3 = Double.parseDouble(num1);
                double num4 = Double.parseDouble(num2);

                switch(operator){
                    case '+':
                        System.out.println("Result: "+(num3+num4));
                        break;
                    case '-':
                        System.out.println("Result: "+(num3-num4));
                        break;
                    case '*':
                        System.out.println("Result: "+(num3*num4));
                        break;
                    case '/':
                        System.out.println("Result: "+(num3/num4));
                        break;
                    default:
                        System.out.println("Invalid operator. Try again");
                        break;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Invalid number format. Try again");
                in.nextLine();
            }
        }
        
    }
    
}
