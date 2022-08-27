package JAVA_1_7_conditional_Statements;

import java.util.Scanner;

public class Student_marks2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(" Enter Obtained Marks ");
		int b = scn.nextInt();
		if (b >= 65) {
			System.out.println(" Student Is Passed With Distinction ");
		} else if (b >= 50) {
			System.out.println(" Student Is Passed With First Class ");
		} else if (b >= 40) {
			System.out.println(" Student Is Passed With Second Class ");
		} else if (b >= 35) {
			System.out.println("Student Is Only Passed ");
		} else {
			System.out.println(" Student Is Failed ");
		}
	}
}
