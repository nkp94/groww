package JAVA_3_4_1_collection_List;

import java.util.LinkedList;

public class Linked_List1 {
public static void main(String[]args) {
	LinkedList ll1=new LinkedList();
	ll1.add(ll1);
	ll1.add("Car");
	ll1.add("Bike");
	ll1.add("Mercedez");
	ll1.add("TATA");
	
	System.out.println(ll1);
	ll1.set(0, "Maruti");
	ll1.remove("Bike");
	System.out.println(ll1);
}
}
