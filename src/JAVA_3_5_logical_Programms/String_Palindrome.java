package JAVA_3_5_logical_Programms;

public class String_Palindrome {
public static void main(String[] args) {
	String s=" NITIN ";
	String rev="";
	for(int t=s.length()-1;t>=0;t--) {
		rev=rev+s.charAt(t);
	}
	System.out.println(rev);
	if(rev.equals(rev)) {
		System.out.println(" The Given String Is Palindrome ");
	}
	else {
		System.out.println(" The Given String Is Not Palindrome ");
	}
}
}
