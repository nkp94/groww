package JAVA_2_1_2__hirarchicle;

public class Hirarchy_Inheritance_Use {// It is the type of inheritance in which multiple subclasses are acquiring single super class 
public static void main(String[]args) {
	Son S=new Son();
			S.BMW();
            S.House();
            S.money();
            S.old_mobile();
            System.out.println("Above Are The Properties Of Son");
     Son1 S1=new Son1();
    		 S1.BMW();
             S1.House();
             S1.money();
             S1.second_hand_bike();
             System.out.println("Above Are The Properties Of Son1 ");
     Son2 S2=new Son2();
             S2.BMW();
             S2.House();
             S2.money();
             S2.Sec_laptop();
             System.out.println("Above Are The Properties Of Son2 ");
} 

}

//step 1 ---> Create Father super class 
//step 2 ---> Create Son sub Class 1 and it extends by Father
//step 3 ---> Create Son1 sub Class 2 and it extends by Son
//step 4 ---> Create Son2 sub Class 3 and it extends by Son1 
//step 4 ---> Create Hirarchy_Inheritance_Use Class (ULC) & use constructor for sub classes Class ---> Son s=new Son();
//          & Call s,s1,s2 from classes
