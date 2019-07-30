package exampleprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class encoding {
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int r=0;int s=0;
	while(n!=0){
		r = n % 10;
		s = s + (r * r);
		n = n / 10;
	}
    System.out.println(s);
    }
 }
