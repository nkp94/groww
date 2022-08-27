package JAVA_3_3_1_exception;

public class Array_Index_out {
public static void main(String[]args) {
	String ar[]=new String[6];
	ar[0] ="__Nilesh__";
	ar[1] ="__Ravikant__";
	ar[2] ="__Sushant__";
	ar[3] ="__Prasad__";
	ar[4] ="__Amol__";
	ar[5] ="__Tushar__";
	//ar[6] ="AIOOBE";
	

	System.out.println(ar[5]);
	System.out.println(ar[4]);
	System.out.println(ar[3]);
	System.out.println(ar[2]);
	System.out.println(ar[1]);
	System.out.println(ar[0]);
	//System.out.println(ar[6]);---> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
//                                 	 at exception.Array_Index_out.main(Array_Index_out.java:12)

}

}
