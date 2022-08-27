package JAVA_3_5_logical_Programms;

public class Number_Pallindrome {
	public static void main(String[] args) {
		int num=121;
		int revNum=0;
		for(int i=num;i>0;i=i/10) {
			int rem=i%10;
			revNum=revNum*10+rem;
		}
		System.out.println(revNum);
		if(num==revNum) {
			System.out.println("given number is palindrome");
		}
		else{
			System.out.println("Given number is not palindrome");
		}
	}
}
