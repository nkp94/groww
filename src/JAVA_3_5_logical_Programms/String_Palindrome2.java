package JAVA_3_5_logical_Programms;

import java.util.Scanner;

public class String_Palindrome2 {
public static void main(String[]args) {
	Scanner scn=new Scanner(System.in);
	System.out.println(" Please Enter Any Name ");
	String s=scn.next();
	String store="";
	for(int u=s.length()-1;u>=0;u--) {
		store=store+s.charAt(u);
	}
	if(s.equals(store)) {
		System.out.println(" Above Name is Palindrome ");
	}
	else {
		System.out.println(" Above Name Is Not Palindrome ");
	}
}
}
