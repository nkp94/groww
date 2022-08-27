package star_Patterns;

public class Diamond {

public static void main(String[] args) {
	int space=6;
	int star=1;
	for(int e=1;e<=13;e++) {
		for(int f=1;f<=space;f++) {
			System.out.print(" ");
		}
		for(int f=1;f<=star;f++) {
			System.out.print("*");
		}
		System.out.println();
		if(e<=6) {
			star=star+2;
			space--;
		}
		else {
			star=star-2;
			space++;
		}
	}
}	
}
