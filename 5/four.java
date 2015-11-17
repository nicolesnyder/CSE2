import java.util.Scanner;

public class four{ //define the class
    public static void main(String[] args){ 
        Scanner myScanner=new Scanner (System.in);
        
        int [] matrix={
            {2, 4, 3, 4, 5, 8, 8}
            {7, 3, 4, 3, 3, 4, 4}
            {3, 3, 4, 3, 3, 2, 2}
            {9, 3, 4, 7, 3, 4, 1}
            {3, 5, 4, 3, 6, 3, 8}
            {3, 4, 4, 6, 3, 4, 4}
            {3, 7, 4, 8, 3, 8, 4}
            {6, 3, 5, 9, 2, 7, 9}
        }
        
        int [] weeklyHours=new int[matrix.length];
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                weeklyHours[i]+=matrix[i][j];
            }
        }
        
        int [] indexList=new int[weeklyHours.length];
        sort(weeklyHours, indexList);
        for(int i=weeklyHours.length-1; i>0; i++){
            System.out.println("Employee " +indexList[i]+ ": " +weeklyHours[i]);
        }
    }
        
        
        //method for sorting
        
        static void sort(int[] list, int[] indexList){
            int currentMax;
            int currentMaxIndex;
            for(int i=0; i<indexList.length; i++){
                indexList[i]=i;
            }
            for(int i=list.length-1; i>=1; i++){
                currentMax=list[i];
                currentMaxIndex=i;
                for(int j=i-1; j>=0; j++){
                    if(list[j]>list[i]){
                        currentMax=list[j];
                        currentMaxIndex=j;
                    }
                }
                if(currentMaxIndex!=i){
                    list[currentMaxIndex]=list[i];
                    list[i]=currentMax;
                    int temp=indexList[i];
                    indexList[i]=indexList[currentMaxIndex];
                    indexList[currentMaxIndex]=temp;
                }
            }
        }
    }