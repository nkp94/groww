package star_Patterns;

public class B_Class {
public static void main(String[]args){
	
	//Nested for loop => writing one for loop inside another for loop
	//    for each & Every Iteration of outer loop inner for loop executes completely
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
		if (i==3 || j==3) {	//
			System.out.print(" * ");
		}
		else {
			System.out.print("   ");
		}//End else
			
		}//End inner for
		System.out.println();
		}
	}
}

