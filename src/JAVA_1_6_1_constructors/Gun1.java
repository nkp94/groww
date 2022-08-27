package JAVA_1_6_1_constructors;

public class Gun1 {
	String gun1Name;
	int NoOfBullets;
	public void shoot() {
		for(int i=1;i<=NoOfBullets;i++) {
			System.out.println("Bang");
		}
	}

}
