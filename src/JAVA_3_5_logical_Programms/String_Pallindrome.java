package JAVA_3_5_logical_Programms;

public class String_Pallindrome {
public static void main(String[] args) {
		
	String org="madam";
	String rev="";
	for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
		if(org.equals(rev)) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("given string is not palindrome");
		}
	}
}
//Scanner scan=new Scanner(System.in);//it will receive input from user through console
////take 1st number 
//System.out.println("enter 1st no"); 
//int num1 = scan.nextInt();//it will take actual integer data from user through console
////take 2nd number
//System.out.println("enter 2nd number");
//int num2 = scan.nextInt();
////add two numbers
//System.out.println("additon is = " +( num1+num2 ));