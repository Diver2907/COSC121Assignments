package A2;
import java.util.Scanner;

public class HexTest{
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
        System.out.print("Side Length: ");
        double length = input.nextDouble();
        
        Hexagon hex1 = new Hexagon(colour,filled,length) {};
        System.out.println("First Hexagon:\n"+hex1.toString());
        Hexagon hex2 = (Hexagon) hex1.clone();
        System.out.println("\nCloned Hexagon:\n"+hex2.toString());
        switch(hex1.compareTo(hex2)){
            case 1:
                System.out.println("Hexagon 1 is larger");
            case -1:
                System.out.println("Hexagon 2 is larger");
            default:
                System.out.println("The Hexagons are identical");
        }

        input.close();
    } 
}