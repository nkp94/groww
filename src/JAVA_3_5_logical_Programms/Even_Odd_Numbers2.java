package JAVA_3_5_logical_Programms;

import java.util.Scanner;

public class Even_Odd_Numbers2 {
public static void main(String[]args) {
	Scanner r=new Scanner(System.in);
	System.out.println(" Enter Any Number ");
	int i=r.nextInt();
	if(i%2==0) {
		System.out.println(" Above Number is Even");
	}
	else {
		System.out.println(" Above Number is ODD ");
	}
}

}
