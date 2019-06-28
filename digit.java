package guvi;

import java.util.Scanner;

public class str {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char [] c = s.toCharArray();
		for(int i=0;i<c.length;i++){
			if(Character.isDigit(c[i])){
				System.out.print(c[i]);
			}
		}
}
}
