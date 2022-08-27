package JAVA_1_7_conditional_Statements;

public class Student_marks {
public static void main(String[]args) {
	int marks= 35;
	if (marks>=65) {
		System.out.println(" Student Is Passed With Distinction ");
	}
	else if(marks>=50) {
		System.out.println(" Student Is Passed With First Class ");
	}
	else if(marks>=40) {
		System.out.println(" Student Is Passed With Second Class ");
	}
	else if(marks>=35) {
		System.out.println("Student Is Only Passed ");
	}
	else {
		System.out.println(" Student Is Failed ");
	}
}
}
