//Nicole Snyder
//CSE002 
//hw8 Area
//prompt user to enter a shape: rectangle, triangle, or circle
//calculate the area of the shape
//if the user does not input one of the shapes, state that it is not an acceptable shape
//makes sure dimensions are valid

import java.util.Scanner;

public class Area{ //define the class
    public static void main(String[] args){ //create a main method


//define inputs        
double height;
double base; 
double length;
double width;
double radius;

Scanner myScanner = new Scanner (System.in); //create a scanner

System.out.print("Enter a shape, rectangle, triangle, or circle: ");
String shape=myScanner.nextLine(); //create a string for the shape

while(true){ //checks to make sure user entered a valid shape
    if (shape.equals("rectangle") || shape.equals("triangle") || shape.equals("circle")){
        break;
    }
    else{
        System.out.print("The shape is not valid. Please enter a valid shape, rectangle, triangle, or circle: ");
        shape=myScanner.nextLine();
    }
}
//if your shape is a rectangle
if(shape.equals("rectangle")){
    System.out.print("Enter the length of the rectangle: ");
    length=input();
    System.out.print("Enter the width of the rectangle: ");
    width=input();
    System.out.println("The area of the rectangle is: " + Rectangle(length, width));
}

//if your shape is a triangle
else if (shape.equals("triangle")){
    System.out.print("Enter the height of the triangle: ");
    height=input();
    System.out.print("Enter the base of the triangle: ");
    base=input();
    System.out.println("The area of the triangle is: " + Triangle(height, base));
}

//if your shape is a circle
else if (shape.equals("circle")){
    System.out.print("Enter the radius of the circle: ");
    radius=input();
    System.out.println("The area of the circle is: " +Circle(radius));
}
}//end of main method

public static double input(){
    Scanner num= new Scanner(System.in); //create a new scanner
    //check to see if the input is a double
    //if the inpupt is a double continue
    //if the input is not a double ask for a valid input
    while(true){
        if (num.hasNextDouble()){
            return num.nextDouble();
        }
        else{
            System.out.print("You did not enter a double! Please enter a double: ");
            num.nextLine();
        }
    }
}

public static double Rectangle(double length, double width){
    return(length*width);
}

//triangle method for calculating area
public static double Triangle(double height, double base){
    return((height*base)/2);
}

//circle method for calculating area
public static double Circle(double radius){
    return(Math.PI *radius*radius);
}

}


