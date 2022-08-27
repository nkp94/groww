package JAVA_3_3_2_exceptin_handling_mechanism;

public class Throws {
	int a= 5;
	int b=7;
public void divide() {
	if(a==5) {
		throw new ArithmeticException("cant devide by 5");
	}
	else {
		 System.out.println(a/b);
}    
}

public static void main(String[] args) {
	Throws t=new Throws();
	t.divide();
	
	try {
		t.divide();
	
	}
	catch(ArithmeticException e) {
		System.out.println("enter valid number");
	}

}
}
