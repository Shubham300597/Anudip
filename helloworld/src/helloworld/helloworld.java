/*
 * 
 */
package helloworld;

import java.util.Scanner;
import static java.lang.System.*;


public class helloworld {
	
	public static void main(String [] args) 
	{
	          if ( args[0].equals ("+"));
	      {
	    	  int num1=Integer.parseInt(args[1]);
	    	  int num2=Integer.parseInt(args[2]);
	    	  System.out.println(num1+num2);
	    	  
	      }
	           if (args[0].equals("-"))
	      {
	    	  int num1=Integer.parseInt(args[1]);
	    	  int num2=Integer.parseInt(args[2]);
	    	  System.out.println(num1-num2);
	      }
	      

	}

}
