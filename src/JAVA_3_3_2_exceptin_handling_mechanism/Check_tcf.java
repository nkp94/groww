package JAVA_3_3_2_exceptin_handling_mechanism;

public class Check_tcf {
public static void main(String[]args) {
	try {
		System.out.println(10/0);// Risky Code
	}
	catch(ArithmeticException a) {
		System.out.println("Please Enter Valid Denominator");
	}
//} //  catch(ArithmeticException obj) {
	
	
//}
   finally {
	   System.out.println("Thank you ");
   }
}
}

//checked Exceptions : Compiler aware exceptions are known as checked exceptions
//Unchecked          : Compiler unaware exception are known as unchecked exceptions
//       Ex        : Custom Exception

//throw keyword      : It is the keyword which is used to raise the exception
//                    raise the exception means

//throws Keyword     : It is keyword,which is used to declare the exception,It is just to overcome Comile Time Error
