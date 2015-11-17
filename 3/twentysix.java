import java.util.*;
    public class twentysix{
        public static void main(String args[]) {
        Scanner myScanner= new Scanner(System.in);
        
        System.out.print("Enter list 1: ");
        int size1=myScanner.nextInt();
        int [] list1= new int [size1];
        
        for(int i=0; i<list1.length; i++){
            list1[i]=myScanner.nextInt();
        }
        
        System.out.print("Enter list 2: ");
        int size2=myScanner.nextInt();
        int [] list2= new int [size2];
        
        for(int i=0; i<list2.length; i++){
            list2[i]=myScanner.nextInt();
        }
        
        if(equals(list1, list2)){
            System.out.println("The two lists are identical");
        }
        
        else{
            System.out.println("The two lists are not identical");
        }
        }
        
        public static boolean equals(int[] list1, int[] list2){
            if(list1.length!=list2.length){
                return false;
            }
            for(int i=0; i<list1.length; i++){
                if(list1[i]!=list2[i]){
                    return false;
                }
            }
            return true;
        }
    }