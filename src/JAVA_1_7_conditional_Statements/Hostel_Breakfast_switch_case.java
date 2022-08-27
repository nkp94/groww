package JAVA_1_7_conditional_Statements;

public class Hostel_Breakfast_switch_case {
public static void main(String[]args) {
switch("") {  //Output Of Expression
//  switch   = The switch keyword is used in conjunction with case and default to create a switch statement, 
//             which evaluates a variable, matches its value to a specific case, 
//             and executes the block of statements associated with that case. 
//             If no case matches the value, the optional block labelled by default is executed, if included.

	case "Puri_bhaji":{//false 
		System.out.println("On Monday");
		break;  // break    = Used to end the execution in the current loop body
	            // case     = A statement in the switch block can be labeled with one or more case or default labels. 
//                            The switch statement evaluates its expression, then executes all statements that follow the matching case label
		
	}
	case "Vada_pav":{//True Case
		System.out.println("On Tuesday");
		break;
	}
	case "Misal":{
		System.out.println("On Wednesday");
		break;
	}
	case "Upma":{
		System.out.println("On Thursday");
		break;
	}
	case "Pav_Bhaji":{
		System.out.println("On Friday");
		break;
	}
	default:{
		System.out.println("Counter Closed");
	}
	}
}
}
