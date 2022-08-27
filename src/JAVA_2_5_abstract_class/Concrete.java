package JAVA_2_5_abstract_class;

public class Concrete extends Abstract{
public void m2() {
	System.out.println("method2 completes through concrete class");
}
public void m3() {
	System.out.println("method3 completes through concrete class");
}
}

// Concrete Class = It is the class which provides implementation to abstract methods/incomplete method 
//                  which are present in abstract using extends keyword.
//                  To create object of abstract class we have to use concrete class
//                  because ,we can't create object of abstract class