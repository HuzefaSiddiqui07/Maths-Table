package com.oracle.cisco.mathtables.dowhile;

import java.util.*;

public class SwitchMathTable_ForLoop {

	public static void main(String[] args) {
		
		// Create an Scanner Object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number to get math tables 21 to 25");
		int table = scan.nextInt();
		
		switch(table) {
		
		case 21 :
			System.out.println("Table of 21");
			int ab =21;
			for(int a = 1; a<=10; a++) {
				System.out.println(ab+ "*" +a+ "=" +ab*a);
				}
			 break;
			 
		case 22 :
			System.out.println("Table of 22");
			int ac =22;
			for(int s = 1; s<=10; s++) {
				System.out.println(ac+ "*" +s+ "=" +ac*s);
				}
			 break;
			 
		case 23 :
			System.out.println("Table of 23");
			int ad =23;
			for(int d = 1; d<=10; d++) {
				System.out.println(ad+ "*" +d+ "=" +ad*d);
				}
			 break;
			 
		case 24 :
			System.out.println("Table of 24");
			int ae =24;
			for(int f = 1; f<=10; f++) {
				System.out.println(ae+ "*" +f+ "=" +ae*f);
				}
			 break;
			 
		case 25 :
			System.out.println("Table of 25");
			int es =25;
			for(int g = 1; g<=10; g++) {
				System.out.println(es+ "*" +g+ "=" +es*g);
				}
			 break;
			 
		default :
			System.out.println("Invalid Number");
		}
	 }
 }
