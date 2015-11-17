import java.util.Scanner; 

public class fourteen{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
int [] numbers= new int [5];
System.out.print("Enter five numbers: ");
for(int i=0; i<numbers.length; i++){
    numbers[i]=myScanner.nextInt();
}
System.out.println("GCD: " +gcd(numbers));
}

public static int gcd(int... numbers){
    int smallest=getSmallest(numbers);
    for (int i=smallest; i>=1; i--){
        int j;
        for (j=0; j<numbers.length; j++){
            if(numbers[j] % i!=0){
                break;
            }
        }
        if(j==numbers.length){
            return i;
        }
    }
    return 1;
}
    
public static int getSmallest(int[] numbers){
    int smallest =numbers[0];
    for(int i=1; i<numbers.length; i++){
        if(numbers[i]<smallest){
            smallest= numbers[i];
        }
    }
    return smallest;
}
}