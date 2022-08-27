package JAVA_3_4_2_Collection_Set;
//Set is the subinterface present inside the collection framework

import java.util.TreeSet;

//There are 3 implementation classes
//[1] HashSet [2] LinkedList [3] TreeSet


public class Tree_Set {
	// It is also Implementatation class
				//[1] Duplicates are Not allowed
				//[2] Null Values are Not allowed 
				//[3] Order of insertion is--> Ascending order
				//[4]  There Is No default Capacity
				//[5] Best Choice = It will remove duplicate elements whenever order of insertion is Ascending order
			    //[6] Data Structure Is Balance Tree --> hashtable--> Storage type
public static void main(String[] args) {
	TreeSet ts = new TreeSet();
	ts.add("Sushant");
	ts.add("Prasad");
	ts.add("Ravikant");
	ts.add("Amol");
	ts.add("Tushar");
	ts.add("Nilesh");
	System.out.println(ts);
	System.out.println(ts.size());
	ts.remove("Nilesh");
	System.out.println(ts);
}
}
