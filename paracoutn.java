package guvi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class str {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String s =  sc.nextLine();int c=0;
		char ch [] = s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='.'){
				c++;
			}
		}
			
		System.out.println(c+1);
				}
		
}
