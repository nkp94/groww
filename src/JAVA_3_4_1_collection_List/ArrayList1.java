package JAVA_3_4_1_collection_List;
// It is already designed framework & It is interface which is sub divided into 3 sub interfaces
//[1] List [2] Set [3] queue
// Collection is invented to remove disadvantages of array concept
//[1] Increase of array homogeneous data is accepted but here hetrogeneous data is accepted
//[2] Here size of collection is not fixed it is growable

// {A} List(I)--> [i] ArrayList [ii] Vector [iii] LinkedList

import java.util.ArrayList;
public class ArrayList1 {
	
	// Array is a data structure which is used to store collection / Multiple data of same data type
	// It is homogeneous in nature
	// While creating array object we need to give capacity
	// It is not growable in nature --> We can't increase size of array
	
public static void main(String[]args) {
	ArrayList al1=new ArrayList();
	al1.add("Nils4u");
	al1.add("Honest");
	al1.add("Hardwork");
	al1.add("happy");
	al1.add(1994);
	al1.add(1994);
	al1.add(null);
	System.out.println(al1);
	 
	// int [  ]  i  =  new  int [ 5 ] ;
	// array data type ..array symbol ..array ref variable = operator/keyword..[5]capacity
	
}
}
