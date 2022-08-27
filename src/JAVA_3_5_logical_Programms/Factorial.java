package JAVA_3_5_logical_Programms;

public class Factorial {
public static void main(String[]args) {
	int n=5;//---> n is number
	int f=1;//---> f is factorial
	for(int i=1;i<=n;i++) {
		f=f*i;
	}
	System.out.println(f);
}

}
