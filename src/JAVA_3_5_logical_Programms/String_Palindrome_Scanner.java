package JAVA_3_5_logical_Programms;

import java.util.Scanner;

public class String_Palindrome_Scanner {
public static void main(String[]args) {
	Scanner scnr=new Scanner(System.in) ;
	System.out.println("Please Enter Any String ");
	String s=scnr.next();
	String res ="";
	for(int i=s.length()-1;i>=0;i--) {
	        res=res+s.charAt(i);
	}
	if(s.equals(res)) {
		System.out.println(" Above String is palindrome ");
	}
	else {
		System.out.println(" Above String Is Not Palindrome ");
	}
	
}
}
