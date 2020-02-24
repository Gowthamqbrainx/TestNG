package org.parallel.crossBrowser;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.UtilityClass;

public class ParallelExeByClassLevelOne extends UtilityClass {
		
	@Test 
	private void testCase1() {
		
		System.out.println("TestCase 1 starts to execute");
		System.out.println(Thread.currentThread().getId());
	
	}
	
	@Test 
	private void testCase2() {
		
		System.out.println("TestCase 2 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testCase3() {
		
		System.out.println("TestCase 3 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test 
	private void testCase4() {
		
		System.out.println("TestCase 4 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testCase5() {
		
		System.out.println("TestCase 5 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
}
