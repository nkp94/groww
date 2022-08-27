package JAVA_3_3_1_exception;

public class Number_Format_ex {
public static void main(String[]args) {
	System.out.println(Integer.parseInt("99A44"));
	//Using parseInt method if inside the String instead of any character is there then we will get Number Format exception
}
}
