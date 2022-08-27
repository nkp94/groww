package star_Patterns;

public class Horizontal_Triangle_Towards_Right_1 {
public static void main(String[]args) {
	int star=1;
	for(int p=1;p<=11;p++) {
		for(int q=1;q<=star;q++) {
			System.out.print(" * ");
		}
		System.out.println();
		if(p<=5) {
			star++;
		}
		else {
			star--;
		}
	}
}
}
