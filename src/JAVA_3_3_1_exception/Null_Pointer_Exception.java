package JAVA_3_3_1_exception;

public class Null_Pointer_Exception {//NPE
	int i =10;// Whenever we are trying to fetch non static members with Null reference we will get NPE
public static void main(String[]args) {
	
	Null_Pointer_Exception npe=null;
	
	System.out.println(npe.i);
	
}

}
