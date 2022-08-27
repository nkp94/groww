package JAVA_1_6_1_constructors;// Constructor is a special type of a method which is used to call/Intialize non static members of a class
                     // During Object Creation

public class PubG {
	public static void main(String[] args) {
		Gun g=new Gun(); //<-------- constructor
		g.gunName="Ak47";
		g.noOfBullets=100;
		g.shoot();
		System.out.println("completed 100th shoot");
	
	//public static void main(String[] args) {
		//Gun g=new Gun();
		//g.gunName="PISTOL";
		//g.noOfBullets=2;
		//g.shoot();
		//System.out.println("completed 2nd shoot");
	}
}
//  Note - Methods we can call many no of times but constructor can be called only once during object creation
//         Constructor does'nt have any return path
//         Constructor name should be as that of class name
//         It will copy/Load all non-static member of class inside the object using new Keyword