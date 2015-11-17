//Write a program that prompts the user to enter the number of students, 
//the students’ names, and their scores, and prints student names in 
//decreasing order of their scores.

import java.util.*;
 
public class seventeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numofstudents = input.nextInt();
        String[] names = new String[numofstudents];
        int[] array = new int[numofstudents];
        for(int i = 0; i < numofstudents; i++) {
            System.out.print("Enter the student's name: ");
            names[i] = input.next();
            System.out.print("Enter the student's score: ");
            array[i] = input.nextInt();
        }
        selectionSort(names, array);
        System.out.println(Arrays.toString(names));
    }
    public static void selectionSort(String[] names, int[] array) {
        for(int i = array.length - 1; i >= 1; i--) {
            String temp;
            int currentMax = array[0];
            int currentMaxIndex = 0;
            for(int j = 1; j <= i; j++) {
                if (currentMax > array[j]) {
                    currentMax = array[j];
                    currentMaxIndex = j;
                }
            }       
                if (currentMaxIndex != i) {
                    temp = names[currentMaxIndex];
                    names[currentMaxIndex] = names[i];
                    names[i] = temp;
                    array[currentMaxIndex] = array[i];
                    array[i] = currentMax;
                }
        }       
    }
}