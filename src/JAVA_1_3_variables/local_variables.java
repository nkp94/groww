package JAVA_1_3_variables;

public class local_variables {//class body open
public static void main(String[] args) {//Method body open
	// These are the variables which are declared inside the method
	// The scope of local variable is always within method block where it is declared
	
	//variable Declaration    ---> Data Type  Variable name;
	//variable initialization ---> Variable name = Data value;
	
	//Example :-
	//=========
	             //byte b; -------> Variable declaration
	             //b = 10  -------> Variable Initialization
	             //int i = 10 -----> Variable Declaration & Initialization within Single line
	
	// Rules For Local Variable
	 //=========================        
	//RULE >> 1    ---> whenever we print variable the value of variable can be printed 
	int i =10;
	System.out.println(i);
   
	//RULE >> 2  ----> Before we use variable it must be declared & Initialized properly
	double d;
	//System.out.println(d);--->Error

	
	//RULE >> 3 -----> we can't declare two local variables with same class
	float s=55.9f;
	//int s=45;---->Error
	

	//RULE >> 4 ------> Once the variable is declared ,we can reinitialize any no of times
	int j=45;
	j=69;
	j=89;
	System.out.println(j);

	//RULE >> 5 -------> Once variables are reintialized the previous values can't be accessed 
	                     // Because it vanishes/Garbage
}

}
