

//Create a main method that uses the methods you created above to 
//Create a ragged 2D array
//print the 2D array
//find the smallest member array and print it
//find the largest member of any member array.  Print the largest member, 
//then print the member array it came from
//find the member array with the largest number of even members and then print 
//it

import java.util.Scanner;

public class lab12{ //define the class
    public static void main(String[] args){ 
        Scanner myScanner=new Scanner (System.in);
        
        int [][] ragged=raggedArray();
        printArray(ragged);
        findSmallest(ragged);
        findLargest(ragged);
        mostEven(ragged);
    }        
        
    public static int [][] raggedArray(){
        int num=10+(int)(Math.random()*11);
        int [][] list= new int[num][];
        for(int i=0; i<num; i++){
            list[i]=new int[(int)(Math.random()*11) +10];
        }
        for(int row=0; row<list.length; row++){
            for(int col=0; col<list[row].length; col++){
                list[row][col]=(int)(Math.random()*2001)-1000;
            }
        }
        return list;
    }
    
    public static void printArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
    public static void printArray(int [] [] array){
        for(int row=0; row<array.length; row++){
            for(int col=0; col<array[row].length; col++){
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void findSmallest(int [][] list){
        int min=list[0][0];
        int num=list.length;
        for(int i=0; i<num; i++){
            int size=list[i].length;
            for(int j=0; j<size; j++){
                if(list[i][j]<min){
                    min=list[i][j];
                }
            }
        }
        System.out.println("The smallest value is: " +min);
    }
    
    public static void findLargest(int [][] list){
        int max=list[0][0];
        int num=list.length;
        for(int i=0; i<num; i++){
            int size=list[i].length;
            for(int j=0; j<size; j++){
                if(list[i][j]>max){
                    max=list[i][j];
                }
            }
        }
        System.out.println("The largest value is: " +max);
    }
    

    public static void mostEven(int [][] list){
        int num=list.length;
        int[]even= new int[num*20];
        int x=0;
        for(int i=0; i<num; i++){
            int size=list[i].length;
            for(int j=0; j<size; j++){
                if(list[i][j]%2==0){
                    even[x]=list[i][j];
                    x++;
                }
            }
        }
        int length=x-1;
        int max=even[0];
        for(int k=0; k<length; k++){
            if(even[k]>max){
                max=even[k];
            }
        }
        System.out.println("The memeber array with the largest number of even numbers is: "+max);
    }
}
    
    
    
    
    
