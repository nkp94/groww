package JAVA_3_5_logical_Programms;

import java.util.Scanner;

public class String_Palindrome_Scanner1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println(" Please Enter Any Value ");
	String d=scan.next();
	String st="";
	for(int e=d.length()-1;e>=0;e--) {
		st=st+d.charAt(e);
	}
	if(d.equals(st)) {
		System.out.println("Given String Is Palindrome");
	}
	else {
		System.out.println(" Above String is not palindrome");
	}
}
}
