package org.parallel.crossBrowser;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.UtilityClass;

public class ParallelExeByClassLevelFive extends UtilityClass {

	
	@Test 
	private void testCase41() {
		
		System.out.println("TestCase 41 starts to execute");
		System.out.println(Thread.currentThread().getId());
	
	}
	
	@Test 
	private void testCase42() {
		
		System.out.println("TestCase 42 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testCase43() {
		
		System.out.println("TestCase 43 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test 
	private void testCase44() {
		
		System.out.println("TestCase 44 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testCase45() {
		
		System.out.println("TestCase 45 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	
}
