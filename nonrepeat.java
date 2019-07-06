package guvi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class str {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}int j=0;
			for(int i=0;i<n;i++){
				for( j=0;j<n;j++){
	            if(i!=j && a[i]==a[j])
	            	break;
				}
	              if(j==n)
	            	System.out.println(a[i]);
	            
	                }
	            }
	            
	        }
		
	
