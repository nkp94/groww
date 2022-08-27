package JAVA_2_7_dap_Solve;

public class Multiple_Inheritance {
public static void main(String[]args) {	
	Imple i=new Imple();
	i.m1();
	i.m2();
	i.m3();
	i.m4();
	//System.out.println(j);

}

}
//  DAP Occures -  One subclass is acquiring properties from two superclasses simultaneously,
//                 here Supercall statement in subclass constructor is getting confusion.
//                 Diamond Ambiguity Problem occures,So that Java will not support Multiple inheritance using classes
//                 But it is possible by using interface	

// step 1 ---> Create I1 interface 
// step 2 ---> Create I2 interface
// step 3 ---> Create Imple Class(BLC) & by using implements keyword  I1,I2 interfaces inherites to Class Imple
// step 4 ---> Create Multiple_Inheritance Class(ULC) & use constructor for Imple Class ---> Imple i=new Imple();
//             & Call i from I1 & I2
