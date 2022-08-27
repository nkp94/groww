package JAVA_3_4_3_cursor;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

// It is used to fetch the data

public class ListIterator_Iterator_Cursor_Linkedlist {// We can fetch data from 7 implementation classes----> Universal Cursor
	// Those are Collection --> [A] Arraylist ,LinkedList,Vector 
//   Implementation Classes     [B] HashSet, LinkedHashset , TreeSet
	//                          [C] PriorityQueue

public static void main(String[]args) {
	Vector v=new Vector ();
	v.add("Akshay");
	v.add(null);
	v.add(null);
	v.add(1994);
	v.add(2022);
	v.add("Kumar");
	//System.out.println(al);
	// Fetching Data With ListIterator Cursor
	
//	ListIterator itr= v.listIterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
	// Fetching Data With Iterator Cursor ( Universal Cursor )
//	Iterator itr=v.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
	
	//Fetching Data Using Enumeration
        Enumeration en=v.elements();
        while(en.hasMoreElements()) {
        	System.out.println(en.nextElement());
        
}
	
}
}
