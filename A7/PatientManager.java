package A7;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Iterator;

public class PatientManager{
    Scanner in = new Scanner(System.in);
    PriorityQueue<Patient> waitingList = new PriorityQueue<>(Comparator.comparing(Patient::getEmergency).thenComparing(Patient::getOrder).reversed());

    public void start(){
        while(true){
            try{
                System.out.print("\n* Choose an item from the menu: ");
                int selection = in.nextInt();
                switch(selection){
                    case 1:
                        newPatient();
                    case 2:
                        nextPatient();
                    case 3:
                        waitingList();
                    case 4:
                        exit();
                    default:
                        System.out.print("(X) Wrong choice.");
                        start();
                }
            }
            catch(InputMismatchException e){
                System.out.print("(X) Wrong choice.");
                in.nextLine();
            }
        }
    }
    
    public void newPatient(){
        
        System.out.print("\tEnter patient's name: ");
        String name = in.next();
        System.out.print("\tEnter emergency [1 (low) to 5 (life-and-death)]: ");
        while(true){
            try{
                int emergency = in.nextInt();
                while((emergency > 5)|| (emergency < 1)){
                    System.out.print("\t(X) Wrong value. Try again: ");
                    emergency = in.nextInt();
                } 
                Patient patient = new Patient(0, name, emergency);
                waitingList.add(patient);
                System.out.print("\tPatient added to the waiting list.");
                start();
            }
            catch(InputMismatchException f){
                System.out.print("\t(X) Wrong value. Try again: ");
                in.nextLine();
            }
        }
       
    }
    public void nextPatient(){
        if(waitingList.size() == 0){
            System.out.print("- No more patients.");
        }
        else{
            System.out.print("\t  - "+waitingList.poll().getName()+" has been treated.");
        }
        start();
    }
    public void waitingList(){
        if(waitingList.size() == 0){
            System.out.print("- No patients in the list.");
        }
        else{
            Iterator<Patient> val = waitingList.iterator();
            System.out.println("\tWaiting list includes: ");
            while(val.hasNext()){
                System.out.println("\t  - "+val.next());
            }
        }
        start();
    }
    public void exit(){
        System.out.println("Program terminated. Good bye!!");
        System.exit(0);
    }    
}
