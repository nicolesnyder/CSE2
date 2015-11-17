import java.util.Scanner;
    public class selectionSort {
        public static void main(String args[]) {
        Scanner myScanner= new Scanner(System.in);
        
        for(int i=0; i<list.length-1; i++){
            double currentMin=list[i];
            int currentMinIndex=0;
            for (int j=i+1; j<list.length; j++){
                if(currentMin>list[j]){
                    currentMin=list[j];
                    currentMinIndex=j;
                }
            }
            if(currentMinIndex!=i){
                list[currentMinIndex]=list[i];
                list[i]= currentMin;
            }
        }
        }
    }