package JAVA_1_7_conditional_Statements;

import java.util.Scanner;

public class License2 {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Any age Value");
		int a=scn.nextInt();
		if(a>=18) {
			System.out.println("You Are Eligible for license");
		}
		else {
			System.out.println("You Are Not Eligible for license");
		}	
	}
}
