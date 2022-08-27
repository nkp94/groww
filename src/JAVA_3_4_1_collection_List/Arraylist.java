package JAVA_3_4_1_collection_List;
//It is already designed framework & It is interface which is sub divided into 3 sub interfaces
//[1] List [2] Set [3] queue
//Collection is invented to remove disadvantages of array concept
//[1] Increase of array homogeneous data is accepted but here hetrogeneous data is accepted
//[2] Here size of collection is not fixed it is growable

//{A} List(I)--> [i] ArrayList [ii] Vector [iii] LinkedList
import java.util.ArrayList;
public class Arraylist {
//Arra-->  Array is a data structure which is used to store collection / Multiple data of same data type
		// It is homogeneous in nature
		// While creating array object we need to give capacity
		// It is not growable in nature --> We can't increase size of array
	// It is also Implementatation class
		//[1] Duplicates are allowed
		//[2] Allow any no of Null Values accepted
		//[3] Order of insertion is maintained
		//[4] default Capacity is 10
		//[5] Best Choice =  Retrival Operation [Fetching is easy]
		//[6] Worst Choice = Manipulation Operation [Left Shift & Right Shift Operation Takes Place
public static void main(String[] args) {
   ArrayList al=new ArrayList();
   
// int [  ]  i  =  new  int [ 5 ] ;
// array data type ..array symbol ..array ref variable = operator/keyword..[5]capacity
   
   al.add("I'm");
   al.add("Nilesh");
   al.add("Krushndev");
   al.add("Patil");
   al.add(1000);
   al.add(999);
   al.add(null);
     System.out.println(al);//it will print entire data in existing sequence
     //System.out.println(al.size());//it will give size of a Arraylist
    // System.out.println(al.contains(999));//checks whether given value is present in Arraylist or not
 
    // System.out.println(al.isEmpty());//it will check whether our Al is empty
     
     //insert new value in array list (right operation)
     al.add(3,200);
    // System.out.println(al.get(3));
     System.out.println(al);
     //remove element from al
     al.remove(3);
     System.out.println(al);
}

}
