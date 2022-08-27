package JAVA_1_5__methods;

public class With_parameter_method {
	public static void main(String[] args) {
		addition(50, 20); // 50 & 20 are Actual Args Of Method Calling Statement  

	}

	public static void addition(int a, int b) {//int a,int b are Formal args Of Called/Implementation Method
		int c = a + b;
		System.out.println(c);
		
		//CTB ---> Compile Time Binding
		//===============================
				 // The Bind /Matching between actual args of method calling statements with respect to 
		         // the Formal args of method Implementation is CTB 
	}

}
