package JAVA_2_2_2_super_Key;

public class Sample2 extends Sample1 {//BLC ----> Here Sample2 is sub-class
int a=60;//global variable of sub class
public void test() {
	int a=20;//local variable of test method
	boolean b = true;//local variable of test method
	System.out.println(a);//1st priority goes to local variable ----> 20
	System.out.println(b);
	System.out.println(this.a);//60
	System.out.println(super.a);//50 <---- from Sample1 (superclass)
	System.out.println(s);
}
}

//super      = Inheritance basically used to achieve dynamic binding or run-time polymorphism in java. 
//             Used to access members of a class inherited by the class in which it appears. 
//             Allows a subclass to access overridden methods and hidden members of its superclass. 
//             The super keyword is also used to forward a call from a constructor to a constructor in the superclass.
//             Also used to specify a lower bound on a type parameter in Generics.