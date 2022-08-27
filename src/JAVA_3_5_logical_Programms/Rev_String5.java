package JAVA_3_5_logical_Programms;

public class Rev_String5 {
public static void main(String[] args) {
	String s="INDIA";
	String st="";
	for(int q=s.length()-1;q>=0;q--) {
		st=st+s.charAt(q);
	}
	System.out.println(st);
}
}
