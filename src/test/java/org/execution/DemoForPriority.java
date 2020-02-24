package org.execution;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.UtilityClass;

public class DemoForPriority extends UtilityClass {
	
	@AfterMethod
	private void executionStarts() {
		time();
	}
	
	@Test (priority = -1)
	private void testCaseOne() {
		
		System.out.println("TestCase 1 starts to execute");
	
	}
	
	@Test (priority = -2)
	private void testCaseTwo() {
		
		System.out.println("TestCase 2 starts to execute");
	
	}
	
	@Test (priority = 2)
	private void testCaseThree() {
		
		System.out.println("TestCase 3 starts to execute");
	
	}
	
	@Test  (priority = 1)
	private void testCaseFour() {
		
		System.out.println("TestCase 4 starts to execute");
		
	}
	
	@Test (priority = 0)
	private void testCasefive() {
		
		System.out.println("TestCase 5 starts to execute");
	
	}
	
	@BeforeMethod
	private void executionEnds() {
	time();
	}
}
