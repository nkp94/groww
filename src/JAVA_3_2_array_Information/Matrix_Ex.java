package JAVA_3_2_array_Information;

public class Matrix_Ex {
public static void main(String[]args) {
	int [][]ar=new int[4][4];
	ar[0][0]=10;
	ar[0][1]=20;
	ar[1][0]=30;
	ar[1][1]=40;
	//System.out.println(ar[0][0]);
	//System.out.println(ar[0][1]);
	//System.out.println(ar[1][0]);
	//System.out.println(ar[1][1]);
	//To Print Entire Matrix
	for (int i=0;i<=1;i++) {
		for(int j=0;j<=1;j++) {
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
}

}
