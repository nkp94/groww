package JAVA_3_4_2_Collection_Set;

// Set is the subinterface present inside the collection framework

// There are 3 implementation classes
// [1] HashSet [2] LinkedList [3] TreeSet
import java.util.HashSet;

public class Hash_Set {
	    // It is also Implementatation class
		//[1] Duplicates are Not allowed
		//[2] Allow only one Null Values 
		//[3] Order of insertion ---> Random Insertion
		//[4]  There Is No default Capacity
		//[5] Best Choice = It will remove duplicate elements whenever order of insertion is not mandatory
	    //[6] Data Structure Is Hybrid( Linear+Hashtable )
public static void main(String[] args) {
	HashSet hs=new HashSet();
    hs.add("Nilesh");
    hs.add(100);
    hs.add(100);
    hs.add("Money");
    System.out.println(hs);
    System.out.println(hs.size());// ---> To Check The Size
  	//System.out.println(hs.capacity());//--> It Will Not Check the capacity
  	System.out.println(hs.isEmpty());//---> To Check whether it is empty
  	System.out.println(hs.contains(200));//---> False
  	//System.out.println(hs.get(0));//-----> It Will Not Fetch Index Value
}

		
}
