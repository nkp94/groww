package JAVA_2_4_2__method_Overriding;

public class Method_Overriding {//ULC
public static void main(String[]args) {
	Animal_Ex ae=new Animal_Ex();
	Cat1 c=new Cat1();
	Dog1 d=new Dog1();
	ae.animalstalk();
	c.animalstalk();
	d.animalstalk();
}

}
// It is the process in which we can change method implementation of superclass accordingly subclass specification
// by creating object of subclass is called as method overriding
// Rules for method overriding :
//      [1] Inheritance is mandatory
//      [2] We have to create object of a subclass
//      [3] Method declaration of superclass as well as subclass must be same