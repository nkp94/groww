package JAVA_3_5_logical_Programms;

import java.util.Scanner;

public class Replace_Special_Characters {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	System.out.println("enter the name with special character");
	  String name = scan.next();
	  String actname = name.replaceAll("[^a-zA-Z0-9]","");
	  System.out.println( actname);
		}
}
