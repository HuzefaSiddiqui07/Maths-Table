package com.oracle.cisco.mathtables.dowhile;

import java.util.*;

public class SwitchMathTable_DoWhile {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		
		System.out.println("Enter the number 2 to 10 you want in the math table ");
        int table = scan.nextInt();
        
        
        switch (table) {
        
        case 2 :
       	 System.out.println("Table Of 2");
       	 int aa = 1;
       	 int fn_2 = 2;
       	 do {
       		 System.out.println(fn_2+ "*" +aa+ "=" +fn_2*aa);
       		 aa++;
       	 } while (aa<=10);
       	 break;
     
 
		case 3 :
       	System.out.println("Table Of 3");
       	int ab = 1;
      	 int fn_3 = 3;
      	 do {
      		 System.out.println(fn_3+ "*" +ab+ "=" +fn_3*ab);
      		 ab++;
      	 } while (ab<=10);
      	break;
      	
      	 
       case 4 :
       	System.out.println("Table Of 4");
       	int ac = 1;
      	 int fn_4 = 4;
      	 do {
      		 System.out.println(fn_4+ "*" +ac+ "=" +fn_4*ac);
      		 ac++;
      	 } while (ac<=10);
      	break;
     
      	 
       case 5 :
       	System.out.println("Table Of 5");
       	int ad = 1;
      	 int fn_5 = 5;
      	 do {
      		 System.out.println(fn_5+ "*" +ad+ "=" +fn_5*ad);
      		 ad++;
      	 } while (ad<=10);
      	break;
      
      	
       case 6 :
          	System.out.println("Table Of 6");
          	int ae = 1;
         	 int fn_6 = 6;
         	 do {
         		 System.out.println(fn_6+ "*" +ae+ "=" +fn_6*ae);
         		 ae++;
         	 } while (ae<=10);
         	break;
         
         	 
       case 7 :
         	System.out.println("Table Of 7");
         	int af = 1;
        	 int fn_7 = 7;
        	 do {
        		 System.out.println(fn_7+ "*" +af+ "=" +fn_7*af);
        		 af++;
        	 } while (af<=10);
        	 break;
             

       case 8 :
        	System.out.println("Table Of 8");
        	int ag = 1;
       	 int fn_8 = 8;
       	 do {
       		 System.out.println(fn_8+ "*" +ag+ "=" +fn_8*ag);
       		 ag++;
       	 } while (ag<=10);
       	break;
       	
       	 

       case 9 :
        	System.out.println("Table Of 9");
        	int ah = 1;
       	 int fn_9 = 9;
       	 do {
       		 System.out.println(fn_9+ "*" +ah+ "=" +fn_9*ah);
       		 ah++;
       	 } while (ah<=10);
       	break;
     
        
       case 10 :
       	System.out.println("Table Of 10");
       	int ai = 1;
      	 int fn_10 = 10;
      	 do {
      		 System.out.println(fn_10+ "*" +ai+ "=" +fn_10*ai);
      		 ai++;
      	 } while (ai<=10);
      	break;
      
      	 
      default :
    	    System.out.println("Invalid Number");
    
     }
   }
}
