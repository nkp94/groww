package JAVA_3_2_array_Information;

public class Info_array {	
//    [i] Array Is A data Structure which is used to store collection / multiple data of same data type
//	 [ii] It is homogeneous in nature
//   [iii]While creating Array object we need to give capacity
//   [iv] It is not growable in nature (We can not increase size of array)
public static void main(String[]args) {
	int[]i=new int[5];
	i[0] = 10;
	i[1] = 20;
	i[2] = 30;
	i[3] = 40;
	i[4] = 50;
    for(int j=0;j<=4;j++){
	System.out.println(i[j]);
	}
	//Print 1st Index
	//System.out.println(i[1]);
	//Print 0th Index
	//System.out.println(i[0]);
	//Print 3rd Index
	//System.out.println(i[3]);
	//System.out.println(i[2]);
	//System.out.println(i[4]);
	//Print 5th Index
	//System.out.println(i[5]);---> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//                                 	at array_Information.Info_array.main(Info_array.java:19)
	String ar[]=new String[6];
	ar[0] ="__Nilesh__";
	ar[1] ="__Ravikant__";
	ar[2] ="__Sushant__";
	ar[3] ="__Prasad__";
	ar[4] ="__Amol__";
	ar[5] ="__Tushar__";
	System.out.println(ar[5]);
	System.out.println(ar[4]);
	System.out.println(ar[3]);
	System.out.println(ar[2]);
	System.out.println(ar[1]);
	System.out.println(ar[0]);

	}
}
