package A6;
import java.util.*;
public class Q1 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 5 integers: ");
        for(int i=0;i<4;i++){
            list.add(in.nextInt());
        }
        System.out.println("Your list without duplicates: "+noDuplicates(list));
    }
    public static ArrayList<Integer> noDuplicates(ArrayList<Integer> list){
        list.trimToSize();
        ArrayList<Integer> checkList = new ArrayList<Integer>();
        for(int num:list){
            if(!checkList.contains(num)){
                checkList.add(num);
            }
        }
        return checkList;
    }
}
