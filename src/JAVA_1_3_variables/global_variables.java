package JAVA_1_3_variables;

public class global_variables {//class body open
	
//                These are the variables which are declared outside the method block & Inside the class body called Global Variables
	
	static byte b;
	static short s;
	static int i;    // Initialization is not mandatory for global variables
	static long a;
	static double d;
	static float f;
	static char ch;
	static boolean bl;
	static String st;
	
public static void main(String[]args) {
	System.out.println(b);   // -----> 0     Default Values for global variables
	System.out.println(s);   // -----> 0
	System.out.println(i);   // -----> 0
	System.out.println(a);   // -----> 0 
	System.out.println(d);   // -----> 0.0 
	System.out.println(f);   // -----> 0.0
    System.out.println(ch);  // -----> []
    System.out.println(bl);  // -----> false
    System.out.println(st);  // -----> null
    
}

}
