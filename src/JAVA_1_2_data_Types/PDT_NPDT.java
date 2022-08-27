package JAVA_1_2_data_Types;//----> It is used to represent type of a data which we are storing inside the memory
//                         It will give size of data

public class PDT_NPDT {//Primitive Data Type & Non-Primitive Data Type
	String Name =" Nilesh Patil ";
public static void main(String[]args) {
	// Primitive Data Type --->  Memory Sizes Are Fixed 
	
	
	byte bt=22; // byte memory size - 1 byte
	System.out.println(bt);
	
	short s=0; // short memory size - 2 byte
	System.out.println(s);
	
	int i=10;//variable declaration and initialization within single line 
	         // int memory size - 4 byte
	System.out.println(i);//printing statement
	
	long a=5682l; // long memory size - 8 byte
	System.out.println(a);
	
	double d=85.69; //// long memory size - 8 byte
	System.out.println(d);
	
	float b=55.96f; // long memory size - 4 byte
	System.out.println(b);
	
	char ch='N'; // long memory size - 2 byte
	System.out.println(ch);
	
	boolean e=true; // long memory size - 1 bit
	System.out.println(e);
	
	// Above are the examples of primitive data types
	// Below example of Non-Primitive Data Type
	
	String name="Nilesh"; // NPDT --->  Memory Size Is Not Fixed
	System.out.println(name);
	
	// java is not a 100% object oriented because it support Non-PDT 
	//also we can make java as 100% object oriented using the concept of wrapper
//Note - wrapper is present inside java.lang package
	
}//method body close

}//class body close

