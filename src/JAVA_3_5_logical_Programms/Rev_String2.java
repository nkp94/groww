package JAVA_3_5_logical_Programms;

public class Rev_String2 {
public static void main(String[] args) {
	String s="Patil";
	String st="";
	for(int t=s.length()-1;t>=0;t--) {
		st=st+s.charAt(t);
	}
	System.out.println(st);
}
}
