//Nicole Snyder
//9-15-15
//CSE2 hw03 Block

import java.util.Scanner;
public class Block{ //define the class
	public static void main(String [] args){ //add a main method
	
//find the volume and surface area of a block
Scanner myScanner = new Scanner( System.in );

//enter the dimensions of the block
System.out.print("Enter the length of the block ");
double length = myScanner.nextDouble();
System.out.print("Enter the width of the block ");
double width = myScanner.nextDouble();
System.out.print("Enter the height of the block ");
double height = myScanner.nextDouble();

//calculate the volume
double volume=(length*width*height);
System.out.print("The volume of the block of dimensions " + length + " x " + width + " x " + height + " is " + volume);

//calculate the surface area
double ab=(2*length*width);
double ac=(2*length*height);
double bc=(2*width*height);
double surfaceArea=(ab+ac+bc);
System.out.print("The surface area of the block is " + surfaceArea);
    
	    
	}  //end of main method   
} //end of class