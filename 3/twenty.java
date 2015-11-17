import java.util.*;
    public class twenty {
        public static void main(String args[]) {
        Scanner myScanner= new Scanner(System.in);
        
        double [] list=new double[10];
        System.out.print("Enter 10 numbers: ");
        for(int i=0; i<list.length; i++){
            list[i]= myScanner.nextDouble();
        }
        selectionSort(list);
        System.out.print("The order is: ");
        printList(list);
        System.out.println(" ");
        
        }
        
        public static void printList(double [] list){
            for(int i=0; i<list.length; i++){
                System.out.print(list[i]+ " ");
            }
        }
        
        public static void selectionSort(double [] list){
            for(int i=0; i<list.length-1; i++){
                double currentMax=list[i];
                int currentMaxIndex=i;
                for(int j=i+1; j<list.length; j++){
                    if(currentMax<list[j]){
                        currentMax=list[j];
                        currentMaxIndex=j;
                    }
                }
                if (currentMaxIndex!=i){
                    list[currentMaxIndex]=list[i];
                    list[i]=currentMax;
                }
            }
        }
    }
        