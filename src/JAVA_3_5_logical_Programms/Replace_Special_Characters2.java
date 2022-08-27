package JAVA_3_5_logical_Programms;

import java.util.Scanner;

public class Replace_Special_Characters2 {
	
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	System.out.println("Please Enter the name with special characters");
	  String nil = scn.next();
	  String store = nil.replaceAll("[^a-zA-Z0-9]","");
	  System.out.println( store);
		}
}
