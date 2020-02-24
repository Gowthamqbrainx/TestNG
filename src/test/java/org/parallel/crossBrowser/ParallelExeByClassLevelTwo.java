package org.parallel.crossBrowser;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.UtilityClass;

public class ParallelExeByClassLevelTwo extends UtilityClass {
	@BeforeMethod
	private void executionStarts() {
		time();
	}
	
	@Test 
	private void testCase11() {
		
		System.out.println("TestCase 1 starts to execute");
		System.out.println(Thread.currentThread().getId());
	
	}
	
	@Test 
	private void testCase12() {
		
		System.out.println("TestCase 2 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testCase13() {
		
		System.out.println("TestCase 3 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test 
	private void testCase14() {
		
		System.out.println("TestCase 4 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testCase15() {
		
		System.out.println("TestCase 5 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	@AfterMethod
	private void executionEnds() {
	time();
	}
}
