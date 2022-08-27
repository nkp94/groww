package JAVA_3_5_logical_Programms;

public class Factorial2 {
public static void main(String[]args) {
	int n=7;
	int factorial=1;
	for(int i=1;i<=n;i++) {
		factorial=factorial*i;
	}
	System.out.println(factorial);
}
}
