package JAVA_1_6_1_constructors;

public class Pubg1 {
	public static void main(String[] args) {
		Gun1 g1=new Gun1(); // Constructor is a special type of a method which is used to call/Intialize non static members of a class
//                             During Object Creation
		g1.gun1Name="Rifle";
		g1.NoOfBullets=7;
		g1.shoot();
		System.out.println("completed 7th shoot");
	}

}
//Note - Methods we can call many no of times but constructor can be called only once during object creation
//       Constructor does'nt have any return path
//       Constructor name should be as that of class name
//       It will copy/Load all non-static member of class inside the object using new Keyword
