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
	           Arrays.sort(a);
	           for(int i=0,j=n-1;i<=n/2;i++,j--){
        		  if(i==j){
            	   System.out.print(a[i]+" ");
	        	   }
        		  else{
        			  System.out.print(a[j]+" "+a[i]+" ");
        		  }
	           }
	           
	           }
	       }
	   
	    	   
