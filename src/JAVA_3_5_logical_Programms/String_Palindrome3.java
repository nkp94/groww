package JAVA_3_5_logical_Programms;

import java.util.Scanner;

public class String_Palindrome3 {
public static void main(String[] args) {
	Scanner can=new Scanner(System.in);
	System.out.println("Enter Value");
	String stg=can.next();
	String stre="";
	for(int r=stg.length()-1;r>=0;r--) {
		stre =stre+stg.charAt(r);
}
	if(stre.equals(stg)) {
		System.out.println("Above is Palindrome");
		
	}
	else {
		System.out.println(" Not Palindrome");
	}
}
  
}
