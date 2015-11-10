import java.util.Scanner;
    public class lab11 {
        public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        int[] array1 = new int[5000];
        int[] array2 = new int[5000];
        
        for(int j=0; j<5000;j++) {
            array1[j]=(int)(Math.random()*100000);
        }
        
        int min=0;
        int max=0;
        
        for(int j=0; j<5000;j++) {
            if(array1[j]<array1[min]) {min=j;}
            if(array1[j]>array1[max]) {max=j;}
        }
        
        System.out.println("The maximum of array1 is: "+array1[max]);
        System.out.println("The minimum of array1 is: "+array1[min]);
        System.out.print("Enter an integer: ");
        
        for(int j=0; j<5000;j++) {
            array2[j]=(int)(Math.random()*j+Math.pow(j,2));
            if(j!=0) {
                if(array2[j]<array2[j-1]) {array2[j]+=array2[j-1];}
            }
        }
        
        
        int key = input.nextInt();
        if(key<0) {return;}
        
        int high=array2.length-1;
        int low=0;
        int mid=0;
        boolean success=false;
        int count=0;
        while(high>=low) {
            mid=(high+low)/2;
            if(array2[mid]==key) {success=true; break;}
            else if(array2[mid]>key) {high=mid;}
            else {low=mid;}
            count++;
            if(count==15) {break;}
        }//while loop
        
        if(success) {
            System.out.println("The key was found at index: "+mid);
        }
        else {
            System.out.println("The key "+key+" was not found");
            System.out.println("The number above the key is "+array2[high]);
            System.out.println("The number below the key is "+array2[low]);
        }
    }//main method
}//public class