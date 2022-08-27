package JAVA_1_8_loops;

public class For_Loops2 {
	static int i;
	public void check() {
		for(i=10; i>=1; i--) {
			System.out.println("i am in For_Loop2");
		}
	}
	public static void main(String args[]) {
		For_Loops2 checked = new For_Loops2();
		checked.check();
	}
}
