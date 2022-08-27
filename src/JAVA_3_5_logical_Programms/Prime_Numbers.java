package JAVA_3_5_logical_Programms;

import java.util.Scanner;

public class Prime_Numbers {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println(" Enter any Number");
	
	int num=scan.nextInt();
	int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
			
		}
	}
	if(count==2) {
		System.out.println(" Entered Number is Prime ");
	}
	else {
		System.out.println(" Entered Number is Not Prime ");
	}
}
}
