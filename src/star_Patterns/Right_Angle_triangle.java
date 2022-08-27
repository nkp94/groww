package star_Patterns;

public class Right_Angle_triangle {
	
public static void main(String[]args) {
	int star=1;
	for(int i=1;i<=9;i++) {
		for(int j=1;j<=star;j++) {
			System.out.print(" * ");
		}
		System.out.println();
		star++;
	}
	
}
}
