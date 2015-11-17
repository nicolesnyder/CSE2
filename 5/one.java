import java.util.Scanner;

public class one{ //define the class
    public static void main(String[] args){ 
        Scanner myScanner=new Scanner (System.in);
        
// Write a method that returns the sum of all the elements in a specified 
//column in a matrix using the following header:
//public static double sumColumn(double[][] m, int columnIndex) 
//Write a test program that reads a 3-by-4 matrix and displays the sum of 
//each column. Here is a sample run:

        double [][] matrix=new double[3][4];
        System.out.print("Enter a " +matrix.length+ " by " +matrix[0].length+ "matrix row by row: ");
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                matrix[row][col]=myScanner.nextDouble();
            }
        }
        System.out.println("Elements in the matrix are: ");
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
        
        for(int col=0; col<matrix[0].length; col++){
            double sum=sumColumn(matrix, col);
            System.out.println("Sum of the elements at column " +col+ " is " +sum);
        }
    }

        

    public static double sumColumn(double[][] m, int columnIndex){
        double total=0;
        for(int row=0; row<m.length; row++){
            total+=m[row][columnIndex];
        }
        return total;
    }
}