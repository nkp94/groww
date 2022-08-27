package JAVA_3_3_1_exception;

public class String_Index_out {
public static void main (String[]args) {
	String s="NILESH";
	System.out.println(s.length());//6
	System.out.println(s.charAt(6));// if we try to fetch index which is not there then we will get SIOOBE
}

}
