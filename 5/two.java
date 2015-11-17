import java.util.Scanner;

public class two{ //define the class
    public static void main(String[] args){ 
        Scanner myScanner=new Scanner (System.in);
        
        double [][] matrix=new double[4][4];
        System.out.print("Enter a " +matrix.length+ " by " +matrix[0].length+ " matrix row by row: ");
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                matrix[row][col]=myScanner.nextDouble();
            }
        }
        
        double sum=sumMajorDiagonal(matrix);
        System.out.println(sum);
    }
        
        

    

public static double sumMajorDiagonal(double[][] m){
    double sum=0;
    for(int row=0; row<m.length; row++){
        for(int col=0; col<m[row].length; col++){
            if(col==row){
                sum+=m[col][row];
            }
        }
    }
    return sum;
}
}