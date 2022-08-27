package JAVA_3_4_2_Collection_Set;
//Set is the subinterface present inside the collection framework

//There are 3 implementation classes
//[1] HashSet [2] LinkedList [3] TreeSet
import java.util.LinkedHashSet;

public class linkedhashset {
	// It is also Implementatation class
			//[1] Duplicates are Not allowed
			//[2] Allow only one Null Values 
			//[3] Order of insertion is maintained
			//[4]  There Is No default Capacity
			//[5] Best Choice = It will remove duplicate elements whenever order of insertion is mandatory
		    //[6] Data Structure Is Hybrid( Linear+Hashtable )
public static void main(String[] args) {
	LinkedHashSet lhs =new LinkedHashSet();
	lhs.add("Nils");
	lhs.add("Nils");
	lhs.add(100);
	lhs.add(null);
	lhs.add(null);
	System.out.println(lhs.size());  // To Get the size
	System.out.println(lhs.contains("Nils")); // True
	System.out.println(lhs);
	
}	
	
	

}
