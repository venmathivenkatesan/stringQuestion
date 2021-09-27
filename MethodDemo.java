 package p1;
 
 class NewMethodDemo{
	
}

class MethodDemo{
	
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();
		md.addTwoNum();
	}
}



// 1. Declare method before main method or after main method
// 2. You can decrare any name of the method which is authenticate.
























/*
Methods In Java
	- A method is a collection of statements that perform some specific task and return the result to the caller. A method can perform some specific task without returning 
	anything. Methods allow us to reuse the code without retyping the code. In Java, every method must be part of some class which is different from languages like C, 
	C++, and Python. 
	- Methods are time savers and help us to reuse the code without retyping the code. 


Method Declaration
In general, method declarations has six components :  

Modifier-: Defines access type of the method i.e. from where it can be accessed in your application. In Java, there 4 types of access specifiers. 
	- public: accessible in all classes in your application.
	- protected: accessible within the class in which it is defined and in its subclass(es)
	- private: accessible only within the class in which it is defined.
	- default (declared/defined without using any modifier): accessible within the same class and package within which its class is defined.

- The return type: The data type of the value returned by the method or void if does not return a value.

- Method Name: the rules for field names apply to method names as well, but the convention is a little different.

- Parameter list: Comma separated list of the input parameters are defined, preceded with their data type, within the enclosed parenthesis. If there are no parameters, you 
must use empty parentheses ().

- Exception list: The exceptions you expect by the method can throw, you can specify these exception(s).

- Method body: it is enclosed between braces. The code you need to be executed to perform your intended operations. 



Access Modifier In Java
	Access modifiers in Java helps to restrict the scope of a class, constructor, variable, method, or data member. There are four types of access modifiers available in 
	java: 

	. Default (No keyword required)
		- Default: When no access modifier is specified for a class, method, or data member – It is said to be having the default access modifier by default. 
		- The data members, class or methods which are not declared using any access modifiers i.e. having default access modifier are accessible only within the same 
		package.

	. Private 
		- Private: The private access modifier is specified using the keyword private. 
		- The methods or data members declared as private are accessible only within the class in which they are declared.
		- Any other class of the same package will not be able to access these members.
		- Top-level classes or interfaces can not be declared as private because
		- private means “only visible within the enclosing class”.

	. Protected
		- protected: The protected access modifier is specified using the keyword protected.
		- The methods or data members declared as protected are accessible within the same package or subclasses in different packages.
		- protected means “only visible within the enclosing class and any subclasses”


	. Public
		- public: The public access modifier is specified using the keyword public. 
		- The public access modifier has the widest scope among all other access modifiers.
		- Classes, methods, or data members that are declared as public are accessible from everywhere in the program. There is no restriction on the scope of public data 
		members.
*/

