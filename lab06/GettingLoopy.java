import java.util.Scanner;

public class GettingLoopy{ //define the class
    public static void main(String[] args){ //create a main method


//step 1
System.out.println("Step 1: ");
int x = 0;
while(x<7){
    x++;
    System.out.print(x);
    }
x=0;
while(x<6){
    x++;
    System.out.print(7);
    }
System.out.println(7);

//step 2
System.out.println("Step 2: ");
System.out.print("While loop: ");

int number = 10;
int factors =2;
while (number<101){
    while(number>=factors){
        if (number%factors==0){
            break;
        }
        else{
            factors++;
            if(number==factors)
            System.out.print(number + " ");
        }
    }
    number++;
    factors=2;
}

System.out.println(" ");

System.out.print("For loop: ");
for(int number2=10; number2<101; number2++){
  boolean isPrime=true;
    for(int factor2=2; factor2<number2; factor2++){
        int remainder; 
        remainder=number2%factor2;
        if(remainder==0){
            isPrime=false;
            break; 
        }
        
    }
    if(isPrime){
        System.out.print(number2+" ");  //print out g if there are no factors
    }
}
System.out.println(" ");
System.out.print("Do While: ");
int number3=10;
do{
    int factor3=2;
    boolean isPrime2=true;
    do{
        int remainder2;
        remainder2=number3%factor3;
        if(remainder2==0){
            isPrime2=false;
            break;
        }
        factor3++;
    }
    while(factor3<number3);
    if(isPrime2){
        System.out.print(number3+ " ");
    }
    number3++;
}
while(number3<101);
System.out.println(" ");

//step 3
System.out.println("Step 3: ");
int random=(int)(Math.random()*200+1); 
int p=0;
while(p<=random){
    if(p<random-20){
    for(int w=0; w<20; w++){
    int face=(int)(Math.random()*2+1);
    if(face==0){
        System.out.print(":) ");
    }
    if(face==1){
        System.out.print(":) "); 
    }
    if(face==2){
        System.out.print(":) ");
    }
    } 
    } 
    if(p>random-20){ 
    for(int a=p; a<random; a++){ 
    int faceln=(int)(Math.random()*2+1); 
    if(faceln==0){ 
        System.out.print(":) ");
    }
    if(faceln==1){
        System.out.print(":) "); 
    }
    if(faceln==2){
        System.out.print(":) ");
    }
    }
    } 
     System.out.println(" "); 
    p=p+20;
}
    
}
}

