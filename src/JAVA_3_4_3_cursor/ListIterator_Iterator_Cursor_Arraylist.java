package JAVA_3_4_3_cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// It is used to fetch the data

public class ListIterator_Iterator_Cursor_Arraylist {// We can fetch data from 7 implementation classes----> Universal Cursor
	// Those are Collection --> [A] Arraylist ,LinkedList,Vector 
//   Implementation Classes     [B] HashSet, LinkedHashset , TreeSet
	//                          [C] PriorityQueue

public static void main(String[]args) {
	ArrayList al=new ArrayList();
	al.add("Nilesh");
	al.add(102);
	al.add(null);
	al.add(102);
	al.add('k');
	al.add("Patil");
	//System.out.println(al);
	// Fetching Data With ListIterator Cursor
//	ListIterator itr= al.listIterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
	//}
	// Fetching Data With Iterator Cursor ( Universal Cursor )
	Iterator itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
