package JAVA_3_5_logical_Programms;

import java.util.Arrays;

public class Compare_Two_Arrays {
public static void main(String[] args) {
	int ar1[]= {10,20,30,40,50};
	int ar2[]= {60,70,80,90,100};
	int ar3[]= {10,20,30,40,50};
	System.out.println(Arrays.equals(ar1, ar2));
	System.out.println(Arrays.equals(ar2, ar3));
	System.out.println(Arrays.equals(ar1, ar3));
}
}
