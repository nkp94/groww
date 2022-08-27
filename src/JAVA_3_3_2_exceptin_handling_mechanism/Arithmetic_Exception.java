package JAVA_3_3_2_exceptin_handling_mechanism;

public class Arithmetic_Exception {
public static void main(String[]args) {
	int a=1;
	int b=0;
	//int c=a/b;//Risky Code
	//System.out.println(c);
	try {
		int c=a/b;
	}
	catch(ArithmeticException ref) {//actual exception name and ref variable name
		System.out.println("Please Enter Valid Denominator");
	}
	    System.out.println(" Exception is handled by using try_catch block");
}
}
