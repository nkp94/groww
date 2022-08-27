package JAVA_3_5_logical_Programms;

import java.util.Arrays;

public class Compare_Two_Arrays2 {
public static void main(String[]args) {
	int are1[]= {90,80,70,50,40,36,32,58};
	int are2[]= {90,80,70,50,40,36,32,58};
	int are3[]= {65,98,75,68,24,69,63,25};
	System.out.println(Arrays.equals(are1, are2));//--> true
	System.out.println(Arrays.equals(are2, are3));//--> false
}
}
