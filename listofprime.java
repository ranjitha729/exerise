package exampleprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class encoding {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     String  primeNumbers = "";
	     for (int i = 1; i <= n; i++){ 		  	  
	          int counter=0; 	  
	          for(int num =i; num>=1; num--){
	             if(i%num==0){
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2){
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println(primeNumbers);
	    }
	
