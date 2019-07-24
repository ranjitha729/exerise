package guvi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class largeno {
public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();int sum=0;
	int a[] =new int[n];
	for(int i=0;i<n;i++){
		a[i]=in.nextInt();
	}
	for(int i=0;i<n;i++){
		if(a[i]<0){
			sum=sum+a[i];
		}
	}
	if(sum!=0){
		System.out.println(sum);
	}else{
		System.out.println(0);
	}
  }
  }
