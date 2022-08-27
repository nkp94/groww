package JAVA_3_5_logical_Programms;

import java.util.Arrays;

public class Compare_Two_Arrays1 {
public static void main(String[]args) {
	int ar1[]= {1,2,3,4,5,6,7,8,9};
	int ar2[]= {9,8,7,5,6,4,3,1,2};
	int ar3[]= {1,2,3,4,5,6,7,8,9};
	System.out.println(Arrays.equals(ar1, ar2));//---> false
	System.out.println(Arrays.equals(ar2, ar3));//---> false
	System.out.println(Arrays.equals(ar1, ar3));//---> true
	
}
}
