package demo;

public class Static_Nonstatic_Diff {//class body open
public static void main(String[]args) {//method body open
	
	
	
	
	
	//Difference Between Static & Non Static Members
	
//               Static Members                                                             Non Static Members 
	
//[1] Static members have single copy(Loaded By Class Loader)     ---   [1] It have Multiple copies
//[2] These members are loaded in static poolarea by Class Loader ---   [2] These members are loaded in Objects using new keyword
//                                                                          with the help of constructor 
//[3] To access static members no need to create object           ---   [3] we have to create object to access non static members
//[4] Static members loaded during loading process                ---   [4] These are loaded during object creation

	                   
	
	
	}//method body close

}//class body close

//   Class = A type that defines the implementation of a particular kind of object.
//           A class definition defines instance and class fields, methods, and inner classes
//           as well as specifying the interfaces the class implements and the immediate superclass of the class. 
//           If the superclass is not explicitly specified, the superclass is implicitly Object. 
//          The class keyword can also be used in the form Class.class to get a Class object without needing an instance of that class. 
//             For example, String.class can be used instead of doing new String().getClass().

