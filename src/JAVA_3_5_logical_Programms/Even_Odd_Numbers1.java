package JAVA_3_5_logical_Programms;

import java.util.Scanner;

public class Even_Odd_Numbers1 {
public static void main(String[]args) {
	Scanner t=new Scanner(System.in);
	System.out.println("  Enter Any Number  ");
	int i=t.nextInt();
	if(i%2==0) {
		System.out.println(" Entered Number Is EVEN");
	}
	else {
		System.out.println(" Entered Number Is ODD");
	}
}

}
