import java.util.Scanner; 

public class twelve{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
//The reverse method in Section 6.7 reverses an array by copying it to a new 
//array. Rewrite the method that reverses the array passed in the argument and 
//returns this array. Write a test program that prompts the user to enter ten 
//numbers, invokes the method to reverse the numbers, and displays the numbers.

int [] list = new int [10];
System.out.print("Enter 10 numbers; ");
for (int i=0; i<list.length; i++){
    list[i]= myScanner.nextInt();
}

reverse(list);

for(int i=0; i<list.length;i++){
    System.out.print(list[i]+ " ");
}
System.out.println();
}

public static int [] reverse(int[] list){
    for(int i=0, j=list.length-1; i<list.length/2; i++, j--){
        int temp=list[i];
        list[i]=list[j];
        list[j]=temp;
    }
    return list;
}
}


