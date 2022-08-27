package JAVA_3_5_logical_Programms;

import java.util.Scanner;

public class Even_Odd_Numbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		if(num%2==0) {
			System.out.println(" Entered number is Even");
		}
		else {
			System.out.println(" Entered number is odd");
		}
	}
}
