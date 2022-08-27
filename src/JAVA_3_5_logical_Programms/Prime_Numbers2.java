package JAVA_3_5_logical_Programms;

public class Prime_Numbers2 {
public static void main(String[]args) {
	int num=5;
	int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
			
		}
	}
	if(count==2) {
		System.out.println(" entered value is prime");
	}
	else {
		System.out.println(" entered value is not prime");
	}
}
}
