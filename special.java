package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class str {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char [] c = s.toCharArray();
		int count =0;
		String p="";
		for(int i=0;i<c.length;i++){
			if(Character.isDigit(c[i])){
				p = p+c[i];
			}
			else if(Character.isAlphabetic(c[i])){
				p = p +c[i];
			}
			else{
				count++;
			}
		}
		System.out.println(count);
}
}
