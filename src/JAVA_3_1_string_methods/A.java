package JAVA_3_1_string_methods;

//We have 14 Non-Static Methods

public class A {
	
public static void main(String[]args) {
	String s1="velocity";
	String s2="VELOCITY";
	String s3="city";
	
	//[1] length()----> it will give count of characters
	System.out.println(s1.length());
	//System.out.println(s2.length());
	
	//[2] toUpperCase() ---> it will convert lowercase string to uppercase 
	System.out.println(s1.toUpperCase());
	//System.out.println(s2.toUpperCase());
	
	//[3] toLowerCase() ---> it will convert uppercase string to lowercase
	//System.out.println(s1.toLowerCase());
	System.out.println(s2.toLowerCase());
	
	//[4] equals() ----> it will compare two strings
	System.out.println(s1.equals(s2));//false
	
	//[5] equalIgnoreCase ---> it will compare to strings
	System.out.println(s2.equalsIgnoreCase(s1));
	
	//[6] contains() -----> it will check for characters inside two strings
	System.out.println(s1.contains(s3));
	
	//[7] charAt() -----> it will give character of string at particular position(SIOOBE)
	System.out.println(s1.charAt(4));
	
	//[8] indexOf -----> it will give index of particular character
	System.out.println(s1.indexOf('c'));
	
	//[9] lastIndexOf ---> it will give last index of string
	System.out.println(s1.lastIndexOf('t'));
	
	//[10] startsWith() ----> it will check our string is start with particular character
	System.out.println(s1.startsWith("v"));// true
	
	//[11] endsWith() ----> it will check our string is ends with particular character
	System.out.println(s1.endsWith("y"));
	
	//[12] substring() ----> it will break the string and display
	System.out.println(s1.substring(4));
	
	//[13] concat() -----> it will join two strings
	System.out.println(s1.concat(s2));
	
	//[14] replace() ----> it will replace the collection of characters
	System.out.println(s1.replace("velo", "Dream"));
	
	
}
}
