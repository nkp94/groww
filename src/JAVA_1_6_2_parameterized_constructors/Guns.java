package JAVA_1_6_2_parameterized_constructors;

public class Guns {//BLC
	String gunName;
	int noOfBullets;
	public Guns(String gunName,int noOfBullets) {
		this.gunName=gunName;
		this.noOfBullets=noOfBullets;
	}
	public void Shoot() {
		for(int i=1;i<=noOfBullets;i++) {
			System.out.println("Deshkeunw");
		}
}
}
