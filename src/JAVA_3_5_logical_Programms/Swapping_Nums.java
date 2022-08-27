package JAVA_3_5_logical_Programms;

import java.util.Scanner;

public class Swapping_Nums {

public static void main(String[]args) {
	Scanner sn=new Scanner(System.in);
	System.out.println(" Print any number ");
	int a=sn.nextInt();
	int b=sn.nextInt();
	System.out.println("Before Swap a is:"+a);
	System.out.println("Before Swap a is:"+b);
	 int c=a;
	 a=b;
	 b=c;
	 System.out.println("After Swap a is:"+a);
	 System.out.println("After Swap b is:"+b);
	
}

}
