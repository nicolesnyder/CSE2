import java.util.Scanner;

public class fourteen{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
//Write a method that returns the gcd of an unspecified number of
//integers. The method header is specified as follows:
//public static int gcd(int... numbers)
//Write a test program that prompts the user to enter five numbers, invokes the
//method to find the gcd of these numbers, and displays the gcd.

        int [] numbers = new int [5];
        System.out.print("Enter five numbers: ");
        for(int i=0; i<5; i++){
            numbers[i]=myScanner.nextInt();
        }
        
        System.out.println(gcd(numbers));
    }

    public static int gcd(int... numbers){
        int smallest=getMin(numbers);
        for(int i=smallest; i>=1; i--){
            int j;
            for(j=0; j<numbers.length; j++){
                if(numbers[j]%i!=0){
                    break;
                }    
            }
            if(j==numbers.length){
                return i;
            }
        }
        return 1;
    }
    
        
    
    
    public static int getMin(int[]numbers){
        int min=numbers[0];
        for(int i=0; i<numbers.length; i++){
            if(min<numbers[i]){
                min=numbers[i];
            }
        }
        return min;
    }
    }