package JAVA_3_5_logical_Programms;

public class Rev_String1 {
public static void main(String[] args) {
	String s="Nilesh";
	String res="";
	for(int p=s.length()-1;p>=0;p--) {
		res=res+s.charAt(p);
		
	}
	System.out.println(res);
}
}
