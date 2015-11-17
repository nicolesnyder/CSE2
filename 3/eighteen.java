//Write a sort method that uses the bubble-sort algorithm. The bubble- sort 
//algorithm makes several passes through the array. On each pass, successive 
//neighboring pairs are compared. If a pair is not in order, its values are 
//swapped; otherwise, the values remain unchanged. The technique is called a 
//bubble sort or sinking sort because the smaller values gradually “bubble” 
//their way to the top and the larger values “sink” to the bottom. Write a 
//test program that reads in ten double numbers, invokes the method, and 
//displays the sorted numbers.


import java.util.*;
    public class eighteen {
        public static void main(String args[]) {
        Scanner myScanner= new Scanner(System.in);
        double [] list= new double [10];
        System.out.print("Enter 10 doubles: ");
        for(int i=0; i<list.length; i++){
            list[i]=myScanner.nextDouble();
        }
       
        bubbleSort(list);
        System.out.println("My list after sort is: ");
        printList(list);
        
        }
        
        public static void printList(double [] list){
            for(int i=0; i<list.length; i++){
                System.out.println(list[i]);
            }
        }
        
        public static void bubbleSort(double [] list){
            boolean changed = true;
            do{
                changed=false;
                for(int j=0; j<list.length-1; j++){
                    if (list[j]>list[j+1]){
                        double temp =list[j];
                        list[j]=list[j+1];
                        list[j+1]=temp;
                        changed=true;
                    }
                }
            }    
                while(changed);
        }
    }
        
    
        