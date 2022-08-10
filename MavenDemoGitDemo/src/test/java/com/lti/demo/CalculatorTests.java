package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

import org.junit.jupiter.api.*;
class CalculatorTests {
	
	Calculator c = new Calculator();
	
    @Disabled
	@Test
	public void testSayHello()
	{
		 Assertions.assertEquals("Hello World", c.sayHello());
	}
	@Test
	public void testaddtwonums()
	{
		int result = c.addNos(100,200);
		 Assertions.assertEquals(300,result);
	}
	
	@Test
	public void testsubtwonums()
	{
		int result1 = c.subNos(100,200);
		 Assertions.assertEquals(300,result1,"Please check subNos code");
	}
	
	@Test
	public void testAssertForNulls()
	{
		 String s1= null;
		 String s2="Nikhil";
		 Assertions.assertNull(s1);
		 Assertions.assertNotNull(s2);
	}
	@Test
	public void testAssertFalse()
	{
		 Assertions.assertFalse("sumit".length()==10);
		 Assertions.assertFalse(10>20, "10 is samller");
		 Assertions.assertNotEquals("Hello", "actual");
	}

	@Test
	public void testArrays()
	{
		ArrayList<Integer> myList = new ArrayList<>();
		Assertions.assertEquals(0,myList.size());
		Assertions.assertTrue(myList.isEmpty());
		
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(0,myList.size());
	}
}
















