package com.expert;

public class Samosa {

	// static ke andar static used he kar sakte hain na ?
	//samosa is  the only container where we want to store the object..na...
	private static  Samosa samosa;
	//constructor will be call when we create objects
	//1.constructor  private hona chihiye
	private Samosa() {
		
	}
	
	//object get kaha  se  karge ? kisi nan kisi method se to karna padega ?
	//bina  object ke method  ko call karna hai..to kai kare ? to method  ko static bana do..na..
	//to aab hum isko class  ke name se call kar saskate hai na ?
	
	//isko bolte hai lazy initilization..for creating the singleton object.
	public static Samosa getSamosa() {
		//object of this class
		// you call as many times as you want but this line should execute only one Right ?
		// to aab kai kar sakte hai ?
		//first time we are checking samosa ki value null hai or not ?
		if(samosa==null) {
			samosa=new Samosa();
		}
		
		return samosa;
	}
	
	// aree bhai but muze  thread safety chaihiye to mai kai karu ???
	//if 4  people  eating your Samosa at a time then what you will do ...?
	// if  you project demand  to thread safety then you need to create thread in synchronixed  way.
	
	//1. constructor private
	//2. object create with the help of  method.
	//3. create field  to store the object is private.
	
}
