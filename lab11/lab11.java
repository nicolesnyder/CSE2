import java.util.Scanner;
    public class lab11 {
        public static void main(String args[]) {
        Scanner myScanner= new Scanner(System.in);
       
//Create two integer arrays (array1 and array2) of size 5000.
//Fill array1 with random integers between 0 and 100000
//Use linear search to print out the minimum and maximum values of array1.
//Add increasing random numbers to array2. (How you do this is an intentional puzzle).
//Print out the minimum and maximum values of array2. (hint you can do this without serious effort at search)
//Prompt the user to enter an int >= 0, and exit the program if they do not enter an int >= 0.
//Use binary search to search the array for the inputted value.
//Say if the number was found or not found.
//If the number was not found, print out the numbers below and above the searched for number (or if there are none, state “none”)

int [] array1 = new int [5000];
int [] array2 = new int [5000];

for (int i=0; i<array1.length; i++){
    array1[i]=(int)(Math.random()*100000);
}

int min= 100001;
int max=-1;

for(int i=0; i<5000; i++){
    if(array1[i]<min){
        min=array1[i];
    }
    if(array1[i]>max){
        max=array1[i];
    }
}

System.out.println("The max of array 1 is: " +max);
System.out.println("The min of array 1 is: " +min);

int num=0;
for(int i=0; i<5000; i++){
    array2[i]=(int)(Math.random()*1000)+num;
    num=array2[i];
}

System.out.println("The max of array 2 is: " +array2[4999]);
System.out.println("The min of array 2 is: " +array2[0]);

int key=0;
System.out.print("Please enter an integer: ");

while(true){
    if(myScanner.hasNextInt()){
        key=myScanner.nextInt();
        if(key<0){
            System.out.print("Please enter an integer greater than 0: ");
            myScanner.nextInt();
        }
        else if(key>=0){
            break;
        }
    }    
    else{
        System.out.print("Please enter an integer: ");
    }
}

int high=array2.length-1;
int low=0;
int mid=0;
while (low <= high) {
    mid = Math.round((low + high)/2);
    if (array2[mid] == key) {  
        System.out.println(key + " was found.");    
        break;
    }
    else if (array2[mid] > key ) {  
        high = mid - 1;
    }
    else if (array2[mid] < key) {   
        low = mid + 1;
    }
    if (low == high && array2[mid] != key){     
        System.out.println(key +" was not found.");     
        if (low == 0){  
            System.out.println("The number below the searched number is none");
        }
        else {
            System.out.println("The number below the searched number is: " + array2[low-1]);
        }
        if (low == 4999){   
            break;  
        }
        else {
            System.out.println("The number above the searched number is: " + array2[low+1]);
            break;  
        }
    }
}

}
}