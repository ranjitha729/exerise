package guvi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class str {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();int c=0;
		int r = n;
		while(r!=0){
			if((r % 10)>1){
				c++;
			}
			r = r /10;
		}
		if(c==0){
		System.out.println("yes");
				}
	else{
		System.out.println("no");
	}
		
}
}
