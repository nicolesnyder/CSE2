//Nicole Snyder
//9-4-15
//CSE2 lab02 Cyclometer
//


public class Cyclometer{ //define the class
	public static void main(String [] args){ //add a main method

//measure the time elapsed in seconds
//measure the number of rotations of the front wheel during time
//do this for two trips

//input data
int secsTrip1=480;  //number of seconds for first trip
int secsTrip2=3220;  //number of seconds for second trip
int countsTrip1=1561;  //number of counts for first trip 
int countsTrip2=9037; //number of counts for second trip

// our intermediate variables and output data
double wheelDiameter=27.0,  //diameter of the wheel 
PI=3.14159, //the constant pi
feetPerMile=5280,  //defining how many feet are in a mile
inchesPerFoot=12,   //defining how many inches are in a foot
secondsPerMinute=60;  //defining how many seconds are in a minute
double distanceTrip1, distanceTrip2,totalDistance;  //defining distance of trip 1, 2, and total

//print out the numbers we have stored in variables that store seconds and counts
 System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
//run the calculations
distanceTrip1=countsTrip1*wheelDiameter*PI;
// Above gives distance in inches
//(for each count, a rotation of the wheel travels
//the diameter in inches times PI)
distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;

//Print out the output data.
System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");



	}//end of main method;
}//end of class;