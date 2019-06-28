package guvi;

import java.util.Scanner;

public class str {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 ="";
		char [] c = s.toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
				 s1 = s1 +c[i];
			}
}
		if(s1!=""){
			System.out.println("yes");
		}
		else{
		System.out.println("no");
		}
}
}
