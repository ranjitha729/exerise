package exampleprogram;

import java.util.Arrays;
import java.util.Scanner;

public class encoding {
public static void main(String [] args){
	    	   Scanner in = new Scanner (System.in);
	    	   int n = in.nextInt();
	           int a[] = new int[n];
	           for(int i=0;i<n;i++){
	        	   a[i]=in.nextInt();
	           }
	           for(int i=0;i<n;i++){
	        	   if(i%2==0 && a[i]%2!=0){
	        		   System.out.print(a[i]+" ");
	        	   }
	        	   else if(i%2!=0 && a[i]%2==0){
	        		   System.out.print(a[i]+" ");
	        	   }
	        	}
	           
	           }
	       }
	   
	    	   


