package JAVA_1_7_conditional_Statements;

import java.util.Scanner;

public class Marriage_Age2 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Boy & Girl Age Respectively");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>=21 && b>=18) {
			System.out.println("Boy/Girl is Eligible for marriage");
		}
		else {
			System.out.println("Boy/Girl is Not eleigible for marriage");
		}
	}
}
