package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class str {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int val=0;
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int count=0,k=0,min=n;
		for(int i=0;i<n;i++){
			count=0;
			
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					val = a[i];
					k=i;
                    count++;
				}
                }
			if(count>0){
				if((min>k)){
					min=k;
				}
				
			}
		}
		if(min>=0){
		System.out.println(a[min]);
		}
		else{
			System.out.println("unique");
		}
		}
		
	
	


