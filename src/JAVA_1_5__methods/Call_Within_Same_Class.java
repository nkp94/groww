package JAVA_1_5__methods;// It is the block of code which runs after calling
                // Methods are used to reduce the code/program
                // We can reuse the code by using methods principles
                // It is used to reduce length of a code

public class Call_Within_Same_Class {//#class body open#
public static void main(String[]args) {//#main method body open#
	
	m3();    // @ static regular method called directly
	m2();    // @ static regular method called directly
	m1();    // @ static regular method called directly
	Nilesh();// @ static regular method called directly
	
}	//#main method boody close#
//#regular method body m1#
public static void m1() {//#regular method body m1 open#
	System.out.println("i am from regular method m1");
}//#regular method body m1 close#
public static void m2() {//#regular method body m2 open#
	System.out.println("i am from regular method m2");
}//#regular method body m2 close# 
public static void m3() {//#regular method body m3 open#
	System.out.println("i am from regular method m3");
}//#regular method body m3 close#
public static void Nilesh() {//#regular method body m3 open#
	System.out.println("i am from regular method Nilesh");
}//#regular method body Nilesh close#	
}//#class body cloose#
