//Nicole Snyder
//CSE002
//hw12 Transpose
//create a method that makes a random Matrix
//create a second method that prints the matrix
//create a third method that tranposes the matrix
//create a main method thats asks user for width and height
//prints matrix and tranposes

import java.util.Scanner;

public class Transpose{ //define the class
    public static void main(String[] args){ 
        Scanner myScanner=new Scanner (System.in);
        
        int height, width; //initialize width and height
        do{
            System.out.print("Enter a positive value for the height: "); //asks for user input
            while(!myScanner.hasNextInt()){//user doesn't enter a number
                String input=myScanner.next();
                System.out.print("Please enter a positive number: ");
        
            }
            int input=myScanner.nextInt();//stores input and examines it
            while(input<=0){
                System.out.println("Please enter a number greater than 0.");
                break;
            }
            height=input; //input is accepted as height
        }
        while(height<=0);
        do{
            System.out.print("Enter a positive value for the width: "); //asks for user input
            while(!myScanner.hasNextInt()){//user doesn't enter a number
                String input=myScanner.next();
                System.out.print("Please enter a positive number: ");
        
            }
            int input=myScanner.nextInt();//stores input and examines it
            while(input<=0){
                System.out.println("Please enter a number greater than 0.");
                break;
            }
            width=input; //input is accepted as height
        }
        while(width<=0);
        
      
        
        int [][]matrix=randomMatrix(height,width);//creates random matrix with values -10 to 10
        System.out.println("The matrix is: ");
        printMatrix(matrix); //prints the matrix
        int [][]tMatrix=transposeMatrix(matrix);//creates transposed matriz
        printMatrix(tMatrix);//prints transposed matrix
        System.out.println(" ");
    }//end of main method

    public static int[][]randomMatrix(int height, int width){//method for creating random matrix
        int[][] matrix=new int [height][width];//creates an array
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                matrix[row][col]=(int)(Math.random()*21)-10;//assigns values from -10 to 10
            }
        }
        return matrix;//returns matrix
    }//end of method
    
    public static void printMatrix(int[][]matrix){//method for printing matrix
        for(int row=0; row<matrix.length; row++){
            if(row>0 && matrix[row].length!=matrix[row-1].length){//then this isn't a rectangular array
                System.out.println("This is not a rectangular array :(");
            }
            for(int col=0; col<matrix[row].length; col++){//prints out array
                System.out.print(matrix[row][col]+"\t");
            }
            System.out.println();
        }
    }//end of method
    
    public static int[][]transposeMatrix(int [][] matrix){//method for transposing matrix
        System.out.println("array transposed: ");
        int height=matrix.length;
        int width=matrix[height-1].length;
        int[][]transposedMatrix=new int[width][height];//for the new matrix, height becomes width and width becomes height
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                transposedMatrix[i][j]=matrix[j][i];//transposes matrix
            }
        }
        return transposedMatrix;//returns the transposed matrix
        
    }//end of method
    
}//end of class