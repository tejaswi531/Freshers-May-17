package com.codebind;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class IntegerUtilsTest2 {
IntegerUtils IntegerUtilsTest2;	
int[]a=new int[] {9,2,7,4,56,1,8};	

@Test
void testMaxValue() {
	int max=IntegerUtils.MaxValue(a);
	assert(max==56);
	System.out.println("max test pass");
}

@Test
void testMinValue() {
	int min=IntegerUtils.MinValue(a);
	assert(min==1);
	System.out.println("min test pass");
}


@org.junit.jupiter.api.BeforeAll
static void beforeAlltest() {
	System.out.println("needs to run before all");
}
@org.junit.jupiter.api.AfterAll
void  afterAlltest() {
	System.out.println("needs to run after all");
}

@org.junit.jupiter.api.BeforeEach
void first() {
	IntegerUtilsTest2=new IntegerUtils();
	System.out.println("needs to run before each");
}

@org.junit.jupiter.api.AfterEach
void last() {
	System.out.println("After each is cleaning up");
	
}
}



			
