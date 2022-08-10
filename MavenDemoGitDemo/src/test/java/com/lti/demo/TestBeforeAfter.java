package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class TestBeforeAfter {
	
	Calculator c = new Calculator();
	int sum=0;
	@BeforeAll
	public static void testBeforeStartUp()
	{
		
		System.out.println("Db connection ");
	}
	
	@BeforeEach
	public void testStartUp()
	{
		sum=0;
		System.out.println("sum is zero "+sum);
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
		 Assertions.assertEquals(-100,result1,"Please check subNos code");
	}
	@AfterEach
	public void testShutDown()
	{
		
		System.out.println("Some object null");
	
}
	@AfterAll
	public static void testAfterStartUp()
	{
		
		System.out.println("Connection Closed");
	}
	


}
