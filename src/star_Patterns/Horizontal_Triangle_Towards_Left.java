package star_Patterns;

public class Horizontal_Triangle_Towards_Left {

public static void main(String[]args) {
	int space=5;
	int star=1;
	for(int i=1;i<=11;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print("   ");
		}
		for(int j=1;j<=star;j++) {
			System.out.print(" * ");
		}
		System.out.println();
		if(i<=5) {
			star++;
			space--;
		}
		else {
		star--;
    	space++;
	}
   }
 }
}

