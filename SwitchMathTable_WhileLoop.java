package com.oracle.cisco.mathtables.whileloop;

import java.util.*;

public class SwitchMathTable_WhileLoop {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		// Create an Scanner Object
		Scanner search = new Scanner(System.in);
		System.out.println("Enter the number 11 to 20 you want in the math table");
		int table = search.nextInt();
		
		switch (table) {
		
		case 11 :
			System.out.println("Table Of 11");
			int q = 1;
			int pn_11 = 11;
			while (q<=10) {
				System.out.println(pn_11+ "*" +q+ "=" +pn_11*q);
				q++;
			}
				break;
				
			case 12 :
				System.out.println("Table Of 12");
				int w = 1;
				int pn_12= 12;
				while (w<=10) {
					System.out.println(pn_12+ "*" +w+ "=" +pn_12*w);
					w++;
				}
					break;
					
				case 13 :
					System.out.println("Table Of 13");
					int e = 1;
					int pn_13= 13;
					while (e<=10) {
						System.out.println(pn_13+ "*" +e+ "=" +pn_13*e);
						e++;
					}
						break;
						
				case 14 :
					System.out.println("Table Of 14");
					int r = 1;
					int pn_14= 14;
					while (r<=10) {
						System.out.println(pn_14+ "*" +r+ "=" +pn_14*r);
						r++;
					}
						break;
						
				case 15 :
					System.out.println("Table Of 15");
					int t = 1;
					int pn_15= 15;
					while (t<=10) {
						System.out.println(pn_15+ "*" +t+ "=" +pn_15*t);
						t++;
					}
						break;
						
				case 16 :
					System.out.println("Table Of 16");
					int y = 1;
					int pn_16= 16;
					while (y<=10) {
						System.out.println(pn_16+ "*" +y+ "=" +pn_16*y);
						y++;
					}
						break;
						
				case 17 :
					System.out.println("Table Of 17");
					int u = 1;
					int pn_17= 17;
					while (u<=10) {
						System.out.println(pn_17+ "*" +u+ "=" +pn_17*u);
						u++;
					}
						break;
						
				case 18 :
					System.out.println("Table Of 18");
					int i = 1;
					int pn_18 = 18;
					while (i<=10) {
						System.out.println(pn_18+ "*" +i+ "=" +pn_18*i);
						i++;
					}
						break;
						
				case 19 :
					System.out.println("Table Of 19");
					int o = 1;
					int pn_19 = 19;
					while (o<=10) {
						System.out.println(pn_19+ "*" +o+ "=" +pn_19*o);
						o++;
					}
						break;
						
				case 20 :
					System.out.println("Table Of 20");
					int p = 1;
					int pn_20 = 20;
					while (p<=10) {
						System.out.println(pn_20+ "*" +p+ "=" +pn_20*p);
						p++;
					}
						break;
						
				default :
					System.out.println("Invalid Number");
			}
		}
     }
