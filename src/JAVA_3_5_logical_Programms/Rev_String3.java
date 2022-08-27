package JAVA_3_5_logical_Programms;

public class Rev_String3 {
public static void main(String[]args) {
	String s="Kavathemahankal";
	String store="";
	for(int c=s.length()-1;c>=0;c--) {
		store=store+s.charAt(c);
		
	}
	System.out.println(store);
}
}
