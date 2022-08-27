package JAVA_2_5_abstract_class;

public class Ulc {//ULC
public static void main(String[]args) {
	Concrete c=new Concrete();
	c.m1();//----> I am complete method from abstract class
	c.m2();//----> method2 completes through concrete class
	c.m3();//----> method3 completes through concrete class
}

}

//step 1 ---> Create Abstract class 
//step 2 ---> Create Concrete class & by using extends keyword attach Abstract class to Concrete class
//step 3 ---> Create Demo Class(ULC) & by using constructor ---> Concrete c=new Concrete(); & Call methods 
//          
