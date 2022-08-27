package JAVA_1_7_conditional_Statements;

import java.util.Scanner;

public class If_Else2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st value");
		int a = scn.nextInt();
		System.out.println("Enter 2nd value");
		int b = scn.nextInt();
		if (a > b) {// true
			System.out.println("<< TRUE >>  ");
		} else {
			System.out.println("<< FALSE >>");
		}
	}

}
//if      = The if keyword is used to create an if statement, which tests a boolean expression; 
//          if the expression evaluates to true, the block of statements associated with the if statement is executed. 
//          This keyword can also be used to create an if-else statement; 

//else    = The else keyword is used in conjunction with if to create an if-else statement, 
//          which tests a boolean expression; 
//          if the expression evaluates to true, the block of statements associated with the if are evaluated;
//           if it evaluates to false, the block of statements associated with the else are evaluated.
