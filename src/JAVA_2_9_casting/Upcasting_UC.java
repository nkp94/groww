package JAVA_2_9_casting;

public class Upcasting_UC {//ULC
public static void main(String[]args) {//ULC
	Father_UC s_uc=new Son_UC();//[i]  Assigning sub class properties to super class is called as Upcasting
	s_uc.money();               // 

}

}

//step 1 ---> Create Father_UC super class 
//step 2 ---> Create Son_UC class & by using extends keyword inherites properties of Father_UC class to Son_UC sub class
//step 3 ---> Create Upcasting_UC Class(ULC) & by using constructor ---> Father_UC s_uc=new Son_UC(); & Call methods 
