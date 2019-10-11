//throwing toJVM
package com.k2js.exceptionhandling.practice;

class StrLength4{
	
	public static void m(Object o){
		
		try{
			String s=(String)o;
			System.out.println(s.length);
		} catch(ClassCastException e){
			System.out.println("User has to provide only string as input");
			System.out.pritnln(e.getMessage());
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
