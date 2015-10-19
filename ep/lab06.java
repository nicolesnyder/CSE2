import java.util.Scanner;

public class lab06{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);

//step 1        
        System.out.println("Step 1: ");
        int count=1;
        while (count<7){
            System.out.print(count);
            count++;
        }
        count=0;
        while (count<6){
            count++;
            System.out.print("7");
        }
        System.out.println("7");
        
//step 2        
        System.out.println("Step 2: ");
        System.out.print("While Loop: ");
        int num= 10;
        int factor= 2;
        while(num<101){
            while (num>=factor){
                if (num%factor==0){
                    break;
                }
                else{
                    factor++;
                    if (num==factor){
                        System.out.print(num + " ");
                    }
                }
            }
            num++;
            factor=2;
        }
        System.out.println(" ");
        
        
        System.out.print("Do While Loop: ");
        int num2=10;
        do{
            int factor2=2;
            boolean isPrime=true;
            do{
                int remainder;
                remainder=num2%factor2;
                if(remainder==0){
                    isPrime=false;
                    break;
                }
                factor2++;
            }
            while(factor2<num2);
            if(isPrime){
                System.out.print(num2+ " ");
            }
            num2++;
        }
        while(num2<101);
        System.out.println(" ");
        
        System.out.print("For Loop: ");
        for(int num3=10; num3<101; num3++){
            boolean isPrime2=true;
            for (int factor3=2; factor3<num3; factor3++){
                int remainder2;
                remainder2=num3%factor3;
                if(remainder2==0){
                    isPrime2=false;
                    break;
                }
            }
                if(isPrime2){
                    System.out.print(num3+ " ");
                }
            }
    System.out.println(" ");
    }
}
