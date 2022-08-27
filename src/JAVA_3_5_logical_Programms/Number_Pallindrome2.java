package JAVA_3_5_logical_Programms;

public class Number_Pallindrome2 {
public static void main(String[] args) {
		int num=111;
		int revNum=0;
		for(int j=num;j>0;j=j/10) {
			int rem=j%10;
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
