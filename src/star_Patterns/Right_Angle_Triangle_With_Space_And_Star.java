package star_Patterns;

public class Right_Angle_Triangle_With_Space_And_Star {

	public static void main(String[]args) {
		int space=4;
		int star=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("   ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print(" * ");
			}
			System.out.println();
			star++;
			space--;
		}
	}
}
