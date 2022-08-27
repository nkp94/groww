package JAVA_3_5_logical_Programms;

import java.util.Scanner;

public class Even_Odd_Numbers3 {
public static void main(String[]args) {
	Scanner snr=new Scanner(System.in);
	System.out.println(" Enter any number ");
	int i=snr.nextInt();
	if(i%2==0) {
		System.out.println(" Entered number is Even ");
	}
	else {
		System.out.println(" Entered number is Odd ");
	}
}

}
