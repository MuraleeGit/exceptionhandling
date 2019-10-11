package com.k2js.exceptionhandling.practice;

class StrLngth {

	public static void m(Object o) {

		try {
			String s = (String) o;
			System.out.println(s.length());
		} catch (ClassCastException e) {
			System.out.println("user has to provide only string as input");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			throw e;
		}
		System.out.println("Execution Completed");
	}
}

class StrLngthTest {
	public static void main(String... abc) {
		StrLngth.m("Hello");
		StrLngth.m(10);
	}

}