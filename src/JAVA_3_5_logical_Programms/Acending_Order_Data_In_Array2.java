package JAVA_3_5_logical_Programms;

import java.util.Arrays;

public class Acending_Order_Data_In_Array2 { //---> Arrays.sort(array_name);
public static void main(String[]args) {
	int ar[]= {23,45,64,56,78,98,87,67};
	Arrays.sort(ar);
	for(int k=0;k<=ar.length-1;k++) {
		System.out.println(ar[k]);
	}
}
}
