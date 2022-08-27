package star_Patterns;

public class Down_Pyramid {
public static void main(String[]args) {
	int space=0;
	int star=13;
	for (int m=1;m<=11;m++) {
		for (int n=1;n<=space;n++) {
			System.out.print(" ");
		}
		for(int n=1;n<=star;n++) {
			System.out.print("*");
		}
		System.out.println();
		star=star-2;
		space++;
	}
}

}
