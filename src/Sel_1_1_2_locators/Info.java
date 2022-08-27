package Sel_1_1_2_locators;

// It is used to identify the element which are present on webpage inside the html code
// [i] All locators are static methods inside the By Class
// [ii] There are 8 Locators
// (1) tagname(String) (2) id(String) (3) name(String) (4) classname (String)
// (5) linktext(String)(6)partial link (7) css selector(String) (8) xpath(String)

//Note = Locators are helping to findElement() & findElements() methods to find the element inside the html code
//
//  html ---> hyper text markup language ---> Used to create frontend/webpage/UI
// To design any web page three things are required
// 1] Tagname   2] Attribute  3] Text

//Difference Between findElement & findElements

//                findElement                                                           findElements

//[1] It will give address of 1st element matching                ---   [1] It will give address of all elements matching  
//[2] Return type is web element                                  ---   [2] Return type is List<webelements>
//[3] If element is not found it will give                              [3] If element is not found it will give size zero exception
//    no such element exception-  

// Types Of Locators

// 1] tagname(String arg)---> Not unique
// 2] id(String arg)
// 3] name(String arg)
// 4] classname(String arg)
// 5] linktext(String arg)
// 6] partiallinktext(String arg)
// 7] css selector(String arg)
// 8] xpath(String arg)

public class Info {

}
