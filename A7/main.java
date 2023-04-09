package A7;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.print("------------------------\n   (1) New Patient.\n   (2) Next Patient.\n   (3) Waiting List.\n   (4) Exit.\n------------------------");
        PatientManager manager = new PatientManager();
        manager.start();
    }
}
