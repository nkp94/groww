package JAVA_3_5_logical_Programms;

public class Find_White_Spaces_In_String {
public static void main(String[] args) {
	String n=" V E L O C I T Y ";
	int count=0;
	for(int i=0;i<=n.length()-1;i++) {
		char ch=n.charAt(i);
		if(ch==' ') {
			count++;
			
		}
		
	}
	System.out.println(count);
	
}
}
