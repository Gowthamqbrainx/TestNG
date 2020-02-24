package org.execution;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utility.UtilityClass;

public class DemoForParameters extends UtilityClass {
	@AfterMethod
	private void executionStarts() {
		time();
	}
	
	@Parameters({"languageOne", "languageTwo"})
	@Test 
	private void testCaseOne(String s1, String s2) {
		System.out.println("The first language name is " +s1);
		System.out.println("The second language value is " +s2);
	}
	
	@BeforeMethod
	private void executionEnds() {
		time();
	}
	
}
