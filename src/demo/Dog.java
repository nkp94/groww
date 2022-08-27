package demo;

public class Dog {//BLC -----> Business Logic Class <--- Main Class Body Open
static int noOflgs =4; // Global Variable
String color= "Black"; // Global Variable
int id;

public void bark() {// bark Method Body Open
//		System.out.println("Bhaw Bhaw");
//		System.out.println(noOflgs);
//		System.out.println(color);
		
 }// bark Method Body Close

public void bite() {// bite Method Body Open
	System.out.println("Injury");
	
}// bite Method Body Close

public static void main(String[] args) {//ULC -----> User Logic Class
	
	 System.out.println(noOflgs);
	 //System.out.println(color);
	 
     Dog d=new Dog(); // ----> Constructor
     d.bark();        // ----> Method Calling within class
     d.bite();        // ----> Method Calling within class
     
}
}// <------ Main Class Body Closed
