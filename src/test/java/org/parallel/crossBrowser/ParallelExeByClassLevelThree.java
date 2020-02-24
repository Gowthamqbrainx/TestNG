package org.parallel.crossBrowser;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.UtilityClass;

public class ParallelExeByClassLevelThree extends UtilityClass{
	
	
	
	@Test 
	private void testCase21() {
		
		System.out.println("TestCase 21 starts to execute");
		System.out.println(Thread.currentThread().getId());
	
	}
	
	@Test 
	private void testCase22() {
		
		System.out.println("TestCase 22 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testCase23() {
		
		System.out.println("TestCase 23 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test 
	private void testCase24() {
		
		System.out.println("TestCase 24 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testCase25() {
		
		System.out.println("TestCase 25 starts to execute");
		System.out.println(Thread.currentThread().getId());
	}
	
	
	
}
