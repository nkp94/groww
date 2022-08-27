package JAVA_2_2_1_this_key;

public class Demo1 {//BLC
	int a=50;//global variable
	public void test() {
		int a=60;//local variable
		System.out.println(a);
		System.out.println(this.a);//this keyword is used in non static 
	}

}

//  this     = Used to represent an instance of the class in which it appears.
//             this can be used to access class members and as a reference to the current instance. 
//             The this keyword is also used to forward a call from one constructor in a class to another constructor in the same class.