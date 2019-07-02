package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class str {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	int a[] = new int[n];
	int i=0,val=0,val1=0,val2=0,value=0;
		for(  i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		for(i=0;i<n;i++){
			for(int j = i+1;j<n;j++){
				for(int k =j+1;k<n;k++){
				val = a[i];
				val1 = a[j];
				val2 = a[k];
				value = val + val1;
				if(value == val2){
				System.out.println(val +" "+val1+" "+value);
			}
		}
		
		}
	}
}
}
	
	







