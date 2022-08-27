package JAVA_2_5_abstract_class; // a class declared with "abstract" keyword is called as abstract class
//                         we can't create object of abstract class
//                         to create object of abstract class we have to use concrete class

abstract public class Abstract {//BLC
public void m1() {
	System.out.println("I am complete method from abstract class");//complete method
}
abstract public void m2();//incomplete method1/abstract method1

abstract public void m3();//incomplete method2/abstract method2

}

// abstract  = A method with no definition must be declared as abstract and the class containing it must be declared as abstract. 
//             Abstract classes cannot be instantiated. Abstract methods must be implemented in the sub classes. 
//             The abstract keyword cannot be used with variables or constructors. 
//             Note that an abstract class isn't required to have an abstract method at all.
