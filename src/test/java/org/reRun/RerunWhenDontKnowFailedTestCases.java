package org.reRun;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.UtilityClass;

public class RerunWhenDontKnowFailedTestCases extends UtilityClass {
	@BeforeMethod
	private void executionStarts() {
		time();
	}
	
	@Test 
	private void testCaseOne() {
		System.out.println("TestCase 1 starts to execute");
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
	@Test 
	private void testCaseTwo() {
		System.out.println("TestCase 2 starts to execute");
		Assert.assertTrue(false);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
	@Test 
	private void testCaseThree() {
		System.out.println("TestCase 3 starts to execute");
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		Assert.assertTrue(true);
	}
	
	@Test
	private void testCaseFour() {
		System.out.println("TestCase 4 starts to execute");
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(false);
	}
	
	@Test 
	private void testCasefive() {
		System.out.println("TestCase 5 starts to execute");
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	private void executionEnds() {
	time();
	}
}
