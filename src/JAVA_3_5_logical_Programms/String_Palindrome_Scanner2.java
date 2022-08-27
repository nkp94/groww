package JAVA_3_5_logical_Programms;

import java.util.Scanner;

public class String_Palindrome_Scanner2 {
public static void main(String[]args) {
	Scanner p=new Scanner(System.in);
	System.out.println(" Enter Any Name ");
	String s=p.next();
	String st="";
	for(int q=s.length()-1;q>=0;q--) {
		st=st+s.charAt(q);
	}
	    if(st.equals(s)) {
	    	System.out.println(" Entered Name is Palindrome ");
	    }
	    else {
	    	System.out.println(" Entered Name is not palindrome ");
	    }
}
}
