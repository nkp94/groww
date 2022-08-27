package JAVA_1_7_conditional_Statements;

import java.util.Scanner;

public class Hostel_Breakfast_switch_case2 {
public static void main(String[]args) {
//Scanner scn=new Scanner(System.in);
//System.out.print("vada is available ");
switch ("vada") { // ---> Output of expression
case "vada":{
	System.out.print( "On Monday");
	break;
}
case"Tea":{
	System.out.println("On Tuesday");
	break;
}
case "Biryani":{
	System.out.println("On Wednesday");
	break;
}
case "samosa":{
	System.out.println("On Thursday");
	break;
}
default:{
	System.out.println("counter Closed");
}
}
}
}
