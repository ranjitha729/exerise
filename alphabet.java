package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class str {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char [] c = s.toCharArray();
        String p = "";String r = "";
        for(int i=0;i<c.length;i++){
        	if(Character.isDigit(c[i])){
        		p = p + c[i];
        	}
        	else if(Character.isAlphabetic(c[i])){
        		r = r +c[i];
        	}
        }
        if(p !="" && r !=""){
        	System.out.println("yes");
        }
        else{
        	System.out.println("no");
        }
			
			
			
}
}







