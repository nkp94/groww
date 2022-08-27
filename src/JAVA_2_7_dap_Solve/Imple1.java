package JAVA_2_7_dap_Solve;

public class Imple1 implements I11,I21 {
	
public void m11() {
	System.out.println("Method m11 calling From interface I11");
}
public void m21() {
	System.out.println("Method m21 calling From interface I11");
}
public void m31() {
	System.out.println("Method m31 calling From interface I21");
}
public void m41() {
	System.out.println("Method m11 calling From interface I21");
	System.out.println(s);
}
}
