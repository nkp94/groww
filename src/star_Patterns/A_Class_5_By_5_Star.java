package star_Patterns;

public class A_Class_5_By_5_Star {
public static void main(String[]args) {
	
	//Nested for loop => writing one for loop inside another for loop
	//    for each & Every Iteration of outer loop inner for loop executes completely
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			System.out.print(" * ");
			
		}
		System.out.println();
	}
}

}
