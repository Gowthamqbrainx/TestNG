package org.execution;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.UtilityClass;

public class DemoForGroupings extends UtilityClass {
	@AfterMethod
	private void executionStarts() {
		time();
	}
	
	@Test (groups = "smoke")
	private void testCaseOne() {
		System.out.println("TestCase 1 starts to execute");
		Assert.assertTrue(true);
		
	}
	
	@Test (groups = "sanity")
	private void testCaseTwo() {
		System.out.println("TestCase 2 starts to execute");
		Assert.assertTrue(false);
		
	}
	
	@Test (groups = "smoke")
	private void testCaseThree() {
		System.out.println("TestCase 3 starts to execute");
		Assert.assertTrue(true);
		
	}
	
	@Test  (groups = "sanity")
	private void testCaseFour() {
		System.out.println("TestCase 4 starts to execute");
		Assert.assertTrue(false);
	}
	
	@Test  (groups = "smoke")
	private void testCasefive() {
		System.out.println("TestCase 5 starts to execute");
		Assert.assertTrue(true);
			}
	
	@BeforeMethod
	private void executionEnds() {
	time();
	}
}
