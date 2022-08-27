package star_Patterns;

public class Cross {
public static void main(String[]args) {
	for(int l=1;l<=5;l++) {
		for(int m=1;m<=5;m++) {
			if(l==m || l+m==6) {
			System.out.print(" * ");
		}
			else {
		 System.out.print("   ");
	}
	
}
     System.out.println();
}
}
}
