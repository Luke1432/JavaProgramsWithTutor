package exercises;

import java.util.Scanner;

public class exerciseNumber7{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Input the number of sides of the polygon: ");
	int ns=input.nextInt();
	System.out.print("Input the length of one side of the polygon: ");
	double side=input.nextDouble();
	System.out.print("The area is: "+polygonArea(ns, side)+"\n");
}
public static double polygonArea(int ns, double side) {
	return(ns*(side*side))/(4.0*Math.tan((Math.PI/ns)));
}
}
