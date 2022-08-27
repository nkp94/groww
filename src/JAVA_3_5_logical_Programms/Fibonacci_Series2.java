package JAVA_3_5_logical_Programms;

public class Fibonacci_Series2 {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int sum=0;
	System.out.print(a +" ");
	System.out.print(b);
	for(int i=2;i<=10;i++) {
		sum=a+b;
		System.out.print(" " +sum);
		a=b;
		b=sum;
		
	}
	
}	

}
