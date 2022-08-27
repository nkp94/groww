package JAVA_3_1_string_methods;//Methods 

public class Reverse_String {
public static void main(String[]args) {
	String org ="retro";
	String rev = "";
for(int i=org.length()-1;i>=0;i--)	{
	rev=rev+org.charAt(i);
}
System.out.println(rev);
//if (org.equals(rev)) {
//System.out.println("The given string is pallindrome");
//}
//else {
//	System.out.println("The given string is not pallindrome");
	
//}
}
	
}
