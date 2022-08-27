package star_Patterns;

public class Triangle1 {
public static void main(String[]args) {
	int space=11;
	int star=1;
	for(int c=1;c<=10;c++) {
		for(int d=1;d<=space;d++) {
			System.out.print(" ");
		}
		for(int d=1;d<=star;d++) {
			System.out.print("*");
		}
		System.out.println();
		space--;
		star=star+2;
	}
}
}
