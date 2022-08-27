package JAVA_1_6_1_constructors;

public class Gun {
	String gunName;
	int noOfBullets;
	public void shoot() {
		for(int i=1;i<=noOfBullets;i++) {
			System.out.println("Boom");//
		}
	}

}
