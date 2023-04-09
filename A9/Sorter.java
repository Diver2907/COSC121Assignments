package A9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Sorter {
    public static void bubbleSort(ArrayList<Patient> list){
        Patient temp;
        int size = list.size();
        for(int i=0;i<size;i++){
            for(int j=1; j<size-i;j++){
                if(list.get(j-1).compareTo(list.get(j))>0){
                    temp = list.get(j-1);
                    list.set(j-1,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
    public static void bubbleSort(ArrayList<Patient>list, Comparator<Patient> comparator){
        Patient temp;
        int size = list.size();
        for(int i=0;i<size;i++){
            for(int j=1; j<size-i;j++){
                if(comparator.compare(list.get(j-1),list.get(j))>0){
                    temp = list.get(j-1);
                    list.set(j-1,list.get(j));
                    list.set(j,temp);
                }
            }
        } 
    }

    public static void selectionSort(ArrayList<Patient>list){
        for(int index = 0; index<list.size();index++){
            int idxMin = index;
            for(int scan = index+1; scan<list.size();scan++){
                if(list.get(idxMin).compareTo(list.get(scan))>0){
                    idxMin = scan;
                }
            }
            Patient temp = list.get(index);
            list.set(index,list.get(idxMin));
            list.set(idxMin,temp);
        }
    }

    public static void insertionSort(ArrayList<Patient> list){
        for(int i = 1;i<list.size();i++){
            Patient item = list.get(i);
            int pos;
            for(pos = i;pos>0;pos--){
                if(list.get(pos-1).compareTo(item)>0){
                    list.set(pos,list.get(pos-1));
                }
                else{
                    break;
                }
            }
            list.set(pos,item);
        }
    }

    public static void sortList() throws CloneNotSupportedException{
        int n = 5000;
        int[] size = new int[10];
        long[] bubbleTimes = new long[10];
        long[] selectionTimes = new long[10];
        long[] insertionTimes = new long[10];
        int index = 0;
        while(n>=5000 && n<=50000){
            System.out.println("Item count: "+n);
            ArrayList<Patient> list1 = new ArrayList<Patient>(n);
            assignValues(list1,n);
            ArrayList<Patient> list2 = (ArrayList<Patient>) list1.clone();
            ArrayList<Patient> list3 = (ArrayList<Patient>) list1.clone();

            long startTime = System.currentTimeMillis();
            bubbleSort(list1);
            long endTime = System.currentTimeMillis();
            bubbleTimes[index] = endTime-startTime;

            startTime = System.currentTimeMillis();
            selectionSort(list2);
            endTime = System.currentTimeMillis();
            selectionTimes[index] = endTime-startTime;

            startTime = System.currentTimeMillis();
            insertionSort(list3);
            endTime = System.currentTimeMillis();
            insertionTimes[index] = endTime-startTime;

            size[index] = n;
            index++;
            n += 5000;
        }
        System.out.println("\n=================\nTABLE OF RESULTS\n=================");
        System.out.printf("%5s%10s%10s%10s\n","N","Bubble","Selection","Insertion");
        for(int i=0;i<index;i++){
            double bubble = (double) bubbleTimes[i]/1000;
            double selection = (double) selectionTimes[i]/1000;
            double insertion = (double) insertionTimes[i]/1000;
            System.out.printf("%5d%10.3f%10.3f%10.3f\n",size[i],bubble,selection,insertion);
        }

    }
    private static void assignValues(ArrayList<Patient> list1, int n) {
        Random rand = new Random();
        for(int i=0;i<n;i++){
            list1.add(new Patient(rand.nextInt(n),"Anonymous",rand.nextBoolean()));
        }
    }
}
