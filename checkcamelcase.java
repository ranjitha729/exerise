package exampleprogram;

import java.util.Arrays;
import java.util.Scanner;

public class encoding {
public static void main(String [] args){
	    	   Scanner in = new Scanner (System.in);
	    	   String s = in.nextLine();
	    	   String st [] = s.split(" ");
	    	   int c=0;
	    	   for(int i=0;i<st.length;i++){
	    		   if(Character.isUpperCase(st[i].charAt(0))){
	    			   c++;
	    		   }
	    	   }
	    	   if(c==st.length){
	    		   System.out.println("yes");
	    	   }
	    	   else{
	    		   System.out.println("no");
	    	   }
}
}
