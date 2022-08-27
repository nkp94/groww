package JAVA_3_4_1_collection_List;
//It is already designed framework & It is interface which is sub divided into 3 sub interfaces
//[1] List [2] Set [3] queue
//Collection is invented to remove disadvantages of array concept
//[1] Increase of array homogeneous data is accepted but here hetrogeneous data is accepted
//[2] Here size of collection is not fixed it is growable

//{A} List(I)--> [i] ArrayList [ii] Vector [iii] LinkedList
import java.util.LinkedList;

public class Linked_List {
	// It is also Implementatation class
	//[1] Duplicates are allowed
	//[2] Allow any no of Null Values accepted
	//[3] Order of insertion is maintained
	//[4] No default Capacity
	//[5] Best Choice = Manipulation Operation
	//[6] Worst Choice = Retrival Operation
	
public static void main(String[]args) {
	LinkedList l=new LinkedList();
	l.add("Nilesh");
	l.add('K');
	l.add("Patil");
	l.add(94);
	l.add("Nilesh");
	l.add(null);
	l.add(null);
	//System.out.println(l.size());
	//System.out.println(l.get(6));
	//System.out.println(l.get(2));
	//System.out.println(l.isEmpty());//---> false
	//System.out.println(l.contains(94));//--> true
	//System.out.println(l.get(0));
	// Insertion in Linked List l [ Right Shift Operation ]
	l.add(0,"Akshay Kumar");
	System.out.println(l);
	// Remove Data From Collection
	l.remove(0);
	System.out.println(l);
	// Modification ,Updation,Replace
	l.set(0, "Nils ");
	System.out.println(l);
	
	
}

}
