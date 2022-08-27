package Sel_2_2_i_frame;

public class Info {

// Iframe  
// ~~~~~~
// ~~~~~~  
//          Displaying one webpage as a part of another webpage is called frame/Iframe
//	OR ---> One webpage is inside another webpage is called as frame/Iframe
	
	
// How to handle frame ?
// ---> //frame --> It is used to check whether webpage controls frame or not
	
// (A) first of all we have to switch our control from main page to particular frame
//	[1] driver.switchTo().frame("AV") ----> check by---> id & name
	
// [ If you bydefault taken class then you will get " No such frame Exception " ]
	
// 	
//	[2] driver.switchTo().parentframe   () ----> It will Navigate from child  to immediate parent
//	[3] driver.switchTo().defaultcontent() ----> It will Navigate from any child to Main webpage
	
}
