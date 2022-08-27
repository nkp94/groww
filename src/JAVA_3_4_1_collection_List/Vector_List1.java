package JAVA_3_4_1_collection_List;

import java.util.Vector;

public class Vector_List1 {

public static void main(String[]args) {
	Vector vl1=new Vector();
	vl1.add("Car");
	vl1.add("TATA");
	vl1.add("car");
	vl1.add("TATA");
	vl1.add(null);
	vl1.add(111);
	vl1.add(null);
	System.out.println(vl1);
	vl1.add(0,"CAR");
	System.out.println(vl1);
	vl1.remove(0);
	System.out.println(vl1);
	vl1.set(0, 100);
	System.out.println(vl1);
}

}
