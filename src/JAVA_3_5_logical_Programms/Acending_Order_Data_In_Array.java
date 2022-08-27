package JAVA_3_5_logical_Programms;

import java.util.Arrays;

public class Acending_Order_Data_In_Array {
public static void main(String[] args) {
	int ar[]= {90,70,80,60,40,50};
	// To Print Entire Data 
	//for(int i=0;i<=ar.length-1;i++) {
		//System.out.println(ar[i]);
		//Print Data In Ascending Order
		Arrays.sort(ar);
		for(int j=0;j<=ar.length-1;j++) {
		System.out.println(ar[j]);
	}
	
//}
}
}
