package JAVA_3_5_logical_Programms;

public class String_Palindrome1 {
public static void main(String[] args) {
	String w=" MADAM ";
	String x="";
	for(int y=w.length()-1;y>=0;y--) {
		x=x+w.charAt(y);
		
	}
	System.out.println(x);
	if (w.equals(x)) {
		System.out.println(" Above String Is Palindrome ");
	}
	else {
		System.out.println(" Above String Is Not Palindrome ");
	}
}
}
