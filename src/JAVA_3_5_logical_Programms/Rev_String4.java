package JAVA_3_5_logical_Programms;

public class Rev_String4 {
public static void main(String[] args) {
	String str="Maharashtra";
	String res="";
	for(int f=str.length()-1;f>=0;f--) {
		res=res+str.charAt(f);
	}
	System.out.println(res);
}
}
