package org.parallel.crossBrowser;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.UtilityClass;

public class ParallelExeByClassLevelFour extends UtilityClass {

	
	
	@Test 
	private void testCase31() {
		
		System.out.println("TestCase 31 starts to execute");
		System.out.println(Thread.currentThread().getId());
	
	}
	
	@Test 
	private void testCase32() {
		
		System.out.println("TestCase 32 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testCase33() {
		
		System.out.println("TestCase 33 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test 
	private void testCase34() {
		
		System.out.println("TestCase 34 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testCase35() {
		
		System.out.println("TestCase 35 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	
}
