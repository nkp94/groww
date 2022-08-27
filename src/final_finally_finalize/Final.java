package final_finally_finalize;

//  final   - The final keyword can be used with class method and variable. 
//            A final class cannot be instantiated, a final method cannot be overridden and a final variable cannot be reassigned.

//  finally - The finally keyword is used to create a block of code that follows a try block. 
//            A finally block of code always executes, whether or not an exception has occurred. 

//  finalize- The finalize () method is used just before object is destroyed and can be called just prior to object creation.

public class Final {//It Is the keyword
public static void main(String[]args) {
	//int i =10;
	Final f=new Final();
}
}
// 
// final - Define an entity once that cannot be changed nor derived from later. 
//         More specifically: a final class cannot be subclassed, a final method cannot be overridden, 
//         and a final variable can occur at most once as a left-hand expression on an executed command. 
//         All methods in a final class are implicitly final.

//finally   - block present in exception handling
//         Used to define a block of statements for a block defined previously by the try keyword. 
//         The finally block is executed after execution exits the try block 
//         and any associated catch clauses regardless of whether an exception was thrown or caught,
//         or execution left method in the middle of the try or catch blocks using the return keyword.

// finalize- Just before destroying any object, the garbage collector always calls finalize() method to perform clean-up activities on that object. 
//           This process is known as Finalization in Java.
//           Garbage Collector Present In Object Class