package JAVA_1_5__methods;

public class NSRMFSC {//Non Static Regular From Same lass
public static void main(String[]args) { //#main method body open#	
	NSRMFSC non=new NSRMFSC();
	non.m1();
	non.Nilesh();
	non.m2();

}//#main method body close#
public void m1() {//#regular method body m1 open#
	System.out.println("running from m1 from SameClass");
	
}//#regular method body m1 open#
public void m2() {//#regular method body m2 open#
	System.out.println("running from m2 from SameClass");
	
}//#regular method body m2 close#	
public void Nilesh() {//#regular method body Nilesh open#
	System.out.println("running from nilesh from SameClass");
}//#regular method body Nilesh close#
}//#class body close#