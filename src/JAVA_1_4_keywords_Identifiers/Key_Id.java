package JAVA_1_4_keywords_Identifiers;

public class Key_Id {
	//abstract 	 ,continue   	,for 	     ,new	     ,switch
	//assert***	 ,default	    ,goto*	     ,package	 ,synchronized
	//boolean	 ,do	        ,if	         ,private	 ,this
	//break	     ,double	    ,implements	 ,protected	 ,throw
	//byte	     ,else	        ,import	     ,public	 ,throws
	//case	     ,enum****	    ,instanceof	 ,return	 ,transient
	//catch	     ,extends	    ,int	     ,short	     ,try
	//char	     ,final	        ,interface	 ,static	 ,void
	//class	     ,finally	    ,long	     ,strictfp** ,volatile
	//const*	 ,float	        ,native	     ,super	      ,while
	
	//Important Keywords
}

//static    = Used to declare a field, method, or inner class as a class field. 
          // Classes maintain one copy of class fields regardless of how many instances exist of that class. 
         // static also is used to define a method as a class method. 
         // Class methods are bound to the class instead of to a specific instance, and can only operate on class fields. 
         //Classes and interfaces declared as static members of another class 
         //or interface are actually top-level classes and are not inner classes.

// abstract  = A method with no definition must be declared as abstract and the class containing it must be declared as abstract. 
             //Abstract classes cannot be instantiated. Abstract methods must be implemented in the sub classes. 
             //The abstract keyword cannot be used with variables or constructors. 
             //Note that an abstract class isn't required to have an abstract method at all.


//switch     =The switch keyword is used in conjunction with case and default to create a switch statement, 
            //which evaluates a variable, matches its value to a specific case, 
            //and executes the block of statements associated with that case. 
            //If no case matches the value, the optional block labelled by default is executed, if included.


//super      = Inheritance basically used to achieve dynamic binding or run-time polymorphism in java. 
            //Used to access members of a class inherited by the class in which it appears. 
            //Allows a subclass to access overridden methods and hidden members of its superclass. 
            //The super keyword is also used to forward a call from a constructor to a constructor in the superclass.
            //Also used to specify a lower bound on a type parameter in Generics.

//this       = Used to represent an instance of the class in which it appears.
           //this can be used to access class members and as a reference to the current instance. 
           //The this keyword is also used to forward a call from one constructor in a class to another constructor in the same class.

// Class     = A type that defines the implementation of a particular kind of object.
             //A class definition defines instance and class fields, methods, and inner classes
             //as well as specifying the interfaces the class implements and the immediate superclass of the class. 
             //If the superclass is not explicitly specified, the superclass is implicitly Object. 
             //The class keyword can also be used in the form Class.class to get a Class object without needing an instance of that class. 
             //For example, String.class can be used instead of doing new String().getClass().

//boolean   = Defines a boolean variable for the values "true" or "false" only.
           // By default, the value of boolean primitive type is false. 

// break    = Used to end the execution in the current loop body

//byte      = The byte keyword is used to declare a field that can hold an 8-bit signed two's complement integer

//short     = The short keyword is used to declare a field that can hold a 16-bit signed two's complement integer.
           // This keyword is also used to declare that a method returns a value of the primitive type

// long    = The long keyword is used to declare a variable that can hold a 64-bit signed two's complement integer.
          // This keyword is also used to declare that a method returns a value of the primitive type long

//float     = The float keyword is used to declare a variable that can hold a 32-bit single precision IEEE 754 floating-point number.
           // This keyword is also used to declare that a method returns a value of the primitive type float

// case     = A statement in the switch block can be labeled with one or more case or default labels. 
           //The switch statement evaluates its expression, then executes all statements that follow the matching case label

//char      = Defines a character variable capable of holding any character of the java source file's character set

// continue = Used to resume program execution at the end of the current loop body

//default   = The default keyword can optionally be used in a switch statement to label a block of statements to be executed,
            //if no case matches the specified value

//do        = The do keyword is used in conjunction with while to create a do-while loop, 
           //which executes a block of statements associated with the loop and then tests a boolean expression associated with the while.
           //If the expression evaluates to true, the block is executed again; 
          // this continues until the expression evaluates to false

//try       = Defines a block of statements that have exception handling. 
           //If an exception is thrown inside the try block, an optional catch block can handle declared exception types. 
          //Also, an optional finally block can be declared that will be executed when execution exits 
         //the try block and catch clauses, regardless of whether an exception is thrown or not. 
         //A try block must have at least one catch clause or a finally block.

//double   = The double keyword is used to declare a variable that can hold a 64-bit double precision IEEE 754 floating-point number 
           //This keyword is also used to declare that a method returns a value of the primitive type double

//else    = The else keyword is used in conjunction with if to create an if-else statement, 
          //which tests a boolean expression; 
         // if the expression evaluates to true, the block of statements associated with the if are evaluated;
          //if it evaluates to false, the block of statements associated with the else are evaluated.

//extends = Used in a class declaration to specify the superclass; 
          //used in an interface declaration to specify one or more super interfaces. 
          //Class X extends class Y to add functionality, either by adding fields or methods to class Y, or by overriding methods of class Y. 
          //An interface Z extends one or more interfaces by adding methods. Class X is said to be a subclass of class Y; 
          //Interface Z is said to be a sub interface of the interfaces it extends.
          //Also used to specify an upper bound on a type parameter in Generics.

//if      = The if keyword is used to create an if statement, which tests a boolean expression; 
          //if the expression evaluates to true, the block of statements associated with the if statement is executed. 
          //This keyword can also be used to create an if-else statement; 

//for     =The for keyword is used to create a for loop, 
        // which specifies a variable initialization, a boolean expression, and an incrementation. 
         //The variable initialization is performed first, and then the boolean expression is evaluated. 
         //If the expression evaluates to true, the block of statements associated with the loop are executed, 
         //and then the incrementation is performed. 
         //The boolean expression is then evaluated again; this continues until the expression evaluates to false.

//implements = Included in a class declaration to specify one or more interfaces that are implemented by the current class. 
            //A class inherits the types and abstract methods declared by the interfaces.

//int       = The int keyword is used to declare a variable that can hold a 32-bit signed two's complement integer.
           //This keyword is also used to declare that a method returns a value of the primitive type int

//interface= Used to declare a special type of class that only contains abstract or default methods,constant fields and static interfaces.
           //It can later be implemented by classes that declare the interface with the implements keyword.
           //As multiple inheritance is not allowed in Java, interfaces are used to circumvent it. 
           //An interface can be defined within another interface.

//new       = Used to create an instance of a class or array object. 
           //Using keyword for this end is not completely necessary (as exemplified by Scala), though it serves two purposes: 
           //it enables the existence of different namespace for methods and class names, 
          //it defines statically and locally that a fresh object is indeed created, 
          //and of what runtime type it is (arguably introducing dependency into the code).

//package  = Java package is a group of similar classes and interfaces. Packages are declared with the package keyword.

//private  = The private keyword is used in the declaration of a method, field, or inner class; 
          //private members can only be accessed by other members of their own class.

//public   = The public keyword is used in the declaration of a class, method, or field; 
          // public classes, methods, and fields can be accessed by the members of any class

//protected = The protected keyword is used in the declaration of a method, field, or inner class;
           // protected members can only be accessed by members of their own class, that class's subclasses or classes from the same package.

// default  = The default keyword can optionally be used in a switch statement to label a block of statements to be executed
            //if no case matches the specified value
            //Alternatively, the default keyword can also be used to declare default values in a Java annotation. 
            //From Java 8 onwards, the default keyword can be used to allow an interface to provide an implementation of a method.	


//return    = Used to finish the execution of a method. 
           // It can be followed by a value required by the method definition that is returned to the caller

//void     = The void keyword is used to declare that a method does not return any value.

//while    = The while keyword is used to create a while loop, which tests a boolean expression 
           //and executes the block of statements associated with the loop 
           //if the expression evaluates to true; this continues until the expression evaluates to false. 
           //This keyword can also be used to create a do-while loop




