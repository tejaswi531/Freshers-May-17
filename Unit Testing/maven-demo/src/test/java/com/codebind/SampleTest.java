package com.codebind;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;




class SampleTest {
	
	
	@org.junit.jupiter.api.BeforeAll
	static void beforeAllInit() {
		System.out.println("needs to run before all");
	}

	@org.junit.jupiter.api.BeforeEach
	void init() {
		Sample sample=new Sample();
	}

	@org.junit.jupiter.api.AfterEach
	void Cleanup() {
		System.out.println("cleaning up");
		
	}

	@Test
	void testAdd() {
		int expected=2;
		Sample sample=new Sample();
		int actual=sample.add(1,1);
		assertEquals(expected,actual,"the add method should add two numbers");
		System.out.println("testAdd pass");
		//fail("Not yet implemented");
	}
	
	@Test
	void testSub() {
		int expected=1;
		Sample sample=new Sample();
		int actual=sample.sub(3,2);
		assertEquals(expected,actual,"the sub method should subtract two numbers");
		System.out.println("testSub pass");
	}
	@Test
	void testdivide() {
		int expected=5;
		Sample sample=new Sample();
		int actual=sample.divide(10,2);
		assertEquals(expected,actual,"the div method should divide two numbers ");
		System.out.println("testdivide pass");
	}

	

	
	

}
