package JAVA_1_6_1_constructors;

public class Station_Example {//sib (static initialization block)
	static {//sib (static initialization block)
		Station_Example SE = new Station_Example();
		SE.dumper();
	}



public static void bumper() {
	System.out.println("i am bumper");
	
	
}

Station_Example(){//constructor defined
	bumper();
}
public void dumper() {
	System.out.println("I am dumper");
	 
}

	
public static void main(String args[]) {

}
}
