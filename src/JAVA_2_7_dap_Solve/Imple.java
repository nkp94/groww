package JAVA_2_7_dap_Solve;

public class Imple implements I1,I2,I3 {//BLC
public void m1(){
	System.out.println("Running from interface 1");

}
public void m2(){
	System.out.println("Running from interface 1");
	System.out.println(I1.j);
}
public void m3() {
	System.out.println("Running from interface 2");
}
public void m4() {
	System.out.println("Running from interface 2");
}

    
}

// implements = Included in a class declaration to specify one or more interfaces that are implemented by the current class. 
//              A class inherits the types and abstract methods declared by the interfaces.