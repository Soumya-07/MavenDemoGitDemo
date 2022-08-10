package com.lti.demos;

public class TestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		String msg = c.sayHello();
		System.out.println(msg);
		
		int sum= c.addNos(1000, 2000);
		System.out.println(sum);

	}

}
