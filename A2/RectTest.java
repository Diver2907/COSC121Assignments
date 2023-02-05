package A2;
import java.util.Scanner;

public class RectTest{
    public static void main(String[]args) throws CloneNotSupportedException{
        Scanner input = new Scanner(System.in);
        System.out.print("Colour: ");
        String colour = input.next();
        System.out.print("Filled: ");
        String filledSt = input.next();
        boolean filled;
        if (filledSt == "Yes"){filled = true;}
        else if(filledSt == "No"){filled = false;}
        else{filled = false;}
        System.out.print("Width: ");
        double width = input.nextDouble();
        System.out.print("Height: ");
        double height = input.nextDouble();
        
        Rectangle rect1 = new Rectangle(colour,filled,width,height) {};
        System.out.println("First Rectangle:\n"+rect1.toString());
        Rectangle rect2 = (Rectangle) rect1.clone();
        System.out.println("\nCloned Rectangle:\n"+rect2.toString());
        System.out.println(rect1.compareTo(rect2));
    } 
}