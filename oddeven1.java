package exampleprogram;

import java.util.Arrays;
import java.util.Scanner;

public class encoding {
public static void main(String [] args){
	    	   Scanner sc = new Scanner (System.in);
	    	   int n = sc.nextInt();
	    	   int s[]= new int [n];
	    	   for(int i=0;i<n;i++){
	    		   s[i]=sc.nextInt();
	    	   }int r=0;int r1=0;int c=0;int c1=0;
	    	   for(int i=0;i<n;i++){
	    		   if(s[i]%2==0){
	    			   r=s[i];
	    			   c++;
	    		   }
	    		   else{
	    			   r1=s[i];
	    			   c1++;
	    		   }
	    	   }
	    	   if(c==1){
	    		   System.out.println(r);
	    	   }
	    	   else{
	    		   System.out.println(r1);
	    	   }
	    	  
	    	  }
	      }
	



