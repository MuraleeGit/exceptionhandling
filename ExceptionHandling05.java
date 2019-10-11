//throwing toJVM
package com.k2js.exceptionhandling.practice;

class StrLength4{
	
	public static void m(Object o){
		
		try{
			String s=(String)o;
			System.out.println(s.length);
		} 
		catch(ClassCastException || NullPointerException e){
			if(e instanceof ClassCastException){
				System.out.println("Only String can be casted, dont enter other tha n strings");
			}
			else if(e instanceof NullPointerException e){
				System.out.println("Null is not valid input");
			}
			throw e;
		}
		System.out.pritnln("Execution done");
	}
}

class StrLength4Test{
	public static void main(String...abc){
		StrLength4.m("hello");
		StrLength4.m(10);
		StrLength4.m(null);
	}
}
