package JAVA_1_6_1_constructors;

public class Nilesh_Patil {//non static variables --->
//static--->same
//
	//ex- class--> dog
	              //obj---> jerman,pomolin,british 
	//String colour
	//int ........(length)
	//Default Constructor---->call---> only when user have not defined 
	Nilesh_Patil(){//user defined zero parameter constructor
		System.out.println("In User defined Zero parameter constructor");
		
}
	Nilesh_Patil(int a,int b,String s1){//user defined parameterized constructor
		System.out.println("In User defined parameterized constructor");
		
	}
public static void main(String[] args) {
	Nilesh_Patil np=new Nilesh_Patil(20,23,"Nilesh");//
	Nilesh_Patil n1=new Nilesh_Patil();
}	
}
//        Constructor is a special type of a method which is used to call/Initialize non static members of a class
//        During Object Creation

// Constructor Functions - 1) It can initialize variables during object creation
//                         2) It will load Non Static members of class into object which is created by new keyword

//Note - Methods we can call many no of times but constructor can be called only once during object creation
//       Constructor does'nt have any return path
//       Constructor name should be as that of class name
//       It will copy/Load all non-static member of class inside the object using new Keyword