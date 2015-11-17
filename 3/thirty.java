import java.util.Scanner;

public class thirty {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    
    System.out.print("Enter the size of the array: ");
    int size=myScanner.nextInt();
    int [] values = new int [size];
    System.out.print("Enter " +size+ " numbers: ");
    for(int i=0; i<values.length; i++){
        values[i]=myScanner.nextInt();
    }
    if(isConsecutiveFour(values)){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
  }    
    
    
    public static boolean isConsecutiveFour(int[] values){
        for(int i=0; i<values.length-3; i++){
            boolean isEqual=true;
            for(int j=i; j<i+3; j++){
                if(values[j]!=values[j+1]){
                    isEqual=false;
                    break;
                }
            }
            if(isEqual){
                return true;
            }      
        }
        return false;
    }
}