package JAVA_3_5_logical_Programms;

import java.util.Scanner;

public class Accept_Input_From_User {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//it will receive input from user through console
		//take 1st number 
		System.out.println("enter 1st no"); 
		int num1 = scan.nextInt();//it will take actual integer data from user through console
		//take 2nd number
		System.out.println("enter 2nd number");
		int num2 = scan.nextInt();
		//add two numbers
		System.out.println("additon is = " +( num1+num2 ));
	}
}
