package guvi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class str {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r=0,s=0;
		while(n!=0){
			r = n % 10;
			r = r * r;
			s = s + r;
			n = n / 10;
		}
		System.out.println(s);
		}
		}
