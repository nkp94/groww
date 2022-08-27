package JAVA_3_5_logical_Programms;

public class Rev_Numbers {
public static void main(String[] args) {
	int num=54321;
	int revnum=0;
	for(int i=num;i>0;i=i/10) {
		int rem=i%10;
		revnum=revnum*10+rem;
	}
	System.out.println(revnum);
}
}
