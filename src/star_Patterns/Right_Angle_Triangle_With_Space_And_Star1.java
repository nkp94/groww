package star_Patterns;

public class Right_Angle_Triangle_With_Space_And_Star1 {

	public static void main(String[]args) {
		int space=4;
		int star=1;
		for(int x=1;x<=5;x++) {
			for(int y=1;y<=space;y++) {
				System.out.print("   ");
			}
			for(int y=1;y<=star;y++) {
				System.out.print("  *  ");
				
			}
			System.out.println();
			star++;
			space--;
		}
	}
}
