package com.bridgelabz.LineCompuationJava;

import java.util.Scanner;

public class LineComputationMain {
	static Double length1=0.0d;
	static Double length2=0.0d;	

public static void main(String[] args)
{
	//printing welcome message
	System.out.println("Welcome to Line Comparison Computatuion Program.");
    System.out.print("\nEnter the first line-\n"); 
    length1 = linecalculation(); 
    System.out.print("\nEnter the second line-\n"); 
    length2 = linecalculation();
    }
  public static Double linecalculation() 
    { 
    	//Line length calculation
	    Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the value of x1 and y1 :");
    	float x1 = scanner.nextFloat();
    	float y1 = scanner.nextFloat();
    	System.out.println("Enter the value of x2 and y2 :");
    	float x2 = scanner.nextFloat();
    	float y2 = scanner.nextFloat();
    	Double length = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    	System.out.println("\nlength of the line is :"+length);
    	return length;
    	} 
}	


