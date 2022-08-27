package JAVA_3_4_1_collection_List;
//It is already designed framework & It is interface which is sub divided into 3 sub interfaces
//[1] List [2] Set [3] queue
//Collection is invented to remove disadvantages of array concept
//[1] Increase of array homogeneous data is accepted but here hetrogeneous data is accepted
//[2] Here size of collection is not fixed it is growable

//{A} List(I)--> [i] ArrayList [ii] Vector [iii] LinkedList
import java.util.Vector;
public class Vectors {// Vector is legacy class in collection.It is oldest class
	// It is also Implementatation class
	//[1] Duplicates are allowed
	//[2] Allow any no of Null Values 
	//[3] Order of insertion is maintained
	//[4] Default Capacity is 10
	//[5] Best Choice = Retrival Operation
	//[6] Worst Choice = Manipulation Operation
public static void main(String[]args) {
	Vector v=new Vector();
	v.add("Nilesh");
	v.add("Patil");
	v.add(100);
	v.add(null);
	v.add(null);
	v.add("Nilesh");//---> This is the oldest class in
	v.add(100);
	//System.out.println(v.size());// ---> To Check The Size
	//System.out.println(v.capacity());//--> To Check the capacity
	//System.out.println(v.isEmpty());//---> To Check whether it is empty
	//System.out.println(v.contains(200));//---> False
	//System.out.println(v.get(0));//-----> It Will Fetch Index Value
	// For Insertion of elements [Right shift operation]
	v.add(0,"Velocity");
	System.out.println(v);
	// For Remove the data [Left Shift Operation]
	v.remove(0);
	System.out.println(v);
	
	// To Modify , Replace , Update , True Data
	v.set(1, 'N');
	System.out.println(v);
}
	

}
