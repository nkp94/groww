package JAVA_3_5_logical_Programms;

public class Remove_Spaces_In_String {
public static void main(String[] args) {
	String str ="MY NAME IS NILESH PATIL";
	String result=str.replaceAll("\\s", "");
	System.out.println(result);
}
}
