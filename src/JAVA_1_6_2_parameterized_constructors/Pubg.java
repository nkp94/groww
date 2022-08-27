package JAVA_1_6_2_parameterized_constructors;

public class Pubg {//ULC
public static void main(String[]args) {
	Guns g=new Guns("Ak47",1);
	g.Shoot();
	System.out.println("1st shoot is done");
	
	
	Guns g1=new Guns("PISTOL",2);
	g1.Shoot();
	System.out.println("2nd shoot done");
	
	Guns g2=new Guns("M4",3);
	g2.Shoot();
	System.out.println("3rd shoot done");
	
}

}
