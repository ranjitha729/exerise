package exampleprogram;

import java.util.Arrays;
import java.util.Scanner;

public class encoding {
public static void main(String [] args){
	    	   Scanner in = new Scanner (System.in);
	    	   int n= in.nextInt();
	    	   int a [] [] =new int [n][n];
	    	   for(int i=0;i<n;i++){
	    		   for(int j=0;j<n;j++){
	    			   a[i][j]=in.nextInt();
	    		   }
	    	   }
	    	   int s=0;
	    	   for(int i=0;i<n;i++){
	    		   for(int j=0;j<n;j++){
	    			   if(i==j){
	    			   s = s+a[i][j];
	    			   }
	    		   }
	    	   }
	    	   System.out.println(s);
	    	   
}
}
	    	   



