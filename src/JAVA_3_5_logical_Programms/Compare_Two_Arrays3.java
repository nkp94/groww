package JAVA_3_5_logical_Programms;

import java.util.Arrays;

public class Compare_Two_Arrays3 {
public static void main(String[]args) {
	int a[]= {1,2,3,4,5,6};
	int b[]= {6,5,4,3,2,1};
	int c[]= {1,2,3,4,5,6};
	System.out.println(Arrays.equals(a, b));
	System.out.println(Arrays.equals(b, c));
	System.out.println(Arrays.equals(a, c));
	
}
}
