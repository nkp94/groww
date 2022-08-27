package star_Patterns;

public class Horizontal_Triangle_Towards_Left_1 {

public static void main(String[]args) {
	int space=3;
	int star=1;
	for(int v=1;v<=7;v++) {
		for(int w=1;w<=space;w++) {
			System.out.print("   ");
		}
		for(int w=1;w<=star;w++) {
			System.out.print(" * ");
		}
		System.out.println();
		if(v<=3) {
			star++;
			space--;
		}
		else {
			star--;
			space++;
		}
		//star--;
		//space++;
	}
	
}
}
