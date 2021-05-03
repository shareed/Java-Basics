package com.revature;

// a static import allow you to call methods directly as if they were in the same class
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathOpsTests {
	public static MathOps mo;
	public static int i;
	public static int j;
	public static int k;
	public static int result;
	
	
	
	@BeforeAll
	public static void setMO() {
		System.out.println("In BeforeAll");
		mo = new MathOps();
	}
	
	@BeforeEach
	public void setInts() {
		System.out.println("In BeforeEach");
		i = 7;
		j = 5;
		k = 0;
	}
	
	@AfterEach
	public void clearResult() {
		System.out.println("In AfterEach");
		result = 0;
	}
	
	@AfterAll
	public static void clearEnv() {
		mo = null;
		System.out.println("In AfterAll");
	}
	
	@Test
	public void testAdd() {
		System.out.println("Testing add");
		result = mo.add(i,  j);
		assertTrue(result == 12);
	}
	
	@Test
	public void testAdd2() {
		System.out.println("Testing add again");
		result = mo.add(i,  j);
		assertEquals(result, 12);
	}
	
	@Test
	public void testSubtract() {
		System.out.println("Testing subtraction");
		result = mo.subtract(i,  j);
		assertNotEquals(result, 7);
	}
	
	@Test
	public void testDivision() {
		System.out.println("Going to try to throw something");
		Throwable exc = assertThrows(
				ArithmeticException.class, () -> {mo.divide(i, k);});//lambda function() -> {}
			//assertEquals(exc.getClass(), ArithmeticException.class);
	}

}
