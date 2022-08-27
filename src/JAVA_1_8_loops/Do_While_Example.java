package JAVA_1_8_loops;

public class Do_While_Example {
	public static void main(String[] args) {
		int i=0;
		do {
			System.out.println(i++);
		}
		while(i<=30);
	}
}
//      do   = The do keyword is used in conjunction with while to create a do-while loop, 
//            which executes a block of statements associated with the loop and then tests a boolean expression associated with the while.
//            If the expression evaluates to true, the block is executed again; 
//            this continues until the expression evaluates to false