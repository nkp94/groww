package JAVA_3_5_logical_Programms;

public class Rev_String {
public static void main(String[]args) {
	String s="NayaN";
	String res="";
	for(int i=s.length()-1;i>=0;i--) {
		res=res+s.charAt(i);
	}
	System.out.println(res);
}

}
//String org ="retro";
//String rev = "";
//for(int i=org.length()-1;i>=0;i--)	{
//rev=rev+org.charAt(i);
//}
//System.out.println(rev);