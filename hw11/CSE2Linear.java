//Nicole Snyder
//CSE002
//hw11 CSE2Linear
//enter 15 grades, sort them, search for a grade, scramble, search


import java.util.Scanner;
    public class CSE2Linear{
        public static void main(String [] args){
            Scanner myScanner = new Scanner(System.in);
            
            int[] finalGrade= new int[15]; //declares array of final grades
		    int studentGrade = 0; //initializes student grades
		    for (int j=0; j< 15; j++){//for the 15 grades, checks to make sure acceptable
		        boolean acceptGrade = false; //assumes grade does not meaat conditions
	        	while (!acceptGrade){//checks to make sure the conditions are met
		            System.out.print("Enter a student's final grade in CSE2: "); //asks for user input
		                if (myScanner.hasNextInt()){ // if it is a number continue
		                    studentGrade = myScanner.nextInt(); 
		                    acceptGrade = true; //this accpets the grades
	                            if (studentGrade < 0 || studentGrade > 100){//grade must be between 0 and 100
	                                acceptGrade = false;// asks for student grade again if not between 0 and 100
	                                System.out.print("You must enter an integer between 0 and 100. ");
	                            }
		                }
		                else{
		                    System.out.print("You must enter an integer. ");
                            myScanner.next();
		                }
		        }//ends while vloop
		    finalGrade[j] = studentGrade;
		    }//ends array 
		
		    selectionSort(finalGrade); //sort the grades from lowest to highest
		    System.out.println("Sorted:");
		    printArray(finalGrade);
		    System.out.print("Enter a grade to search for: ");
		    int num= myScanner.nextInt();
		    linearSearch(finalGrade, num); //searches for grade
		    scramble(finalGrade); //scrambles grades
		    System.out.println("Scrambled");
		    printArray(finalGrade); //prints scrambled grades
		    System.out.print("Enter a grade to search for: ");
		    num= myScanner.nextInt();
		    linearSearch(finalGrade, num); //searches for grade
		
		
        }//ends main method
		
           
        public static void selectionSort(int[] list){ //method for sorting grades
            for (int j=0; j<list.length-1; j++){
                int minNow= list[j]; //the current min
                int minNowIndex=j; //indexes the mins
                for (int k= j+1; k<list.length; k++){
                    if (minNow>list[k]){ //if loop for min
                        minNow=list[k];
                        minNowIndex=k;
                    }
                }
                if (minNowIndex !=j){ 
                    list[minNowIndex]=list[j];
                    list[j]=minNow;
                }
            }
        }// end of selection sort method
        
        
        public static void linearSearch(int array[], int search){//main method for searing
            for (int j=0; j<array.length; j++){
                if (array[j] == search){
                    System.out.println(search + " is found within " + j + " iterations"); //prints
                    return;//returns to the user
                }
            }
            System.out.println("The number " +search+ " was not found in the list");
        }//end of method linear search
        
        public static void scramble (int[] array){ //main method for scrambling
            for(int j=0; j<array.length; j++){
                int count= (int)(Math.random()*array.length); //uses math.random to scramble
                int temporary= array[j];
                array[j]= array[count];
                array[count]=temporary;
            }
        }//end of main method scamble
        
        public static void printArray(int[] grade){ //main method for printing array
            int j=0;
            for(j=0; j<grade.length; j++){
                System.out.print(grade[j]+ " ");
            }
            System.out.println();
        }//end of print array method
    }//end of public class
        
        
        
     
  
    
    
    
    
    
    
    