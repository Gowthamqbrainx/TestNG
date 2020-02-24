package org.execution;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utility.UtilityClass;

public class DemoForDataProvider extends UtilityClass {

@AfterMethod
private void executionStarts() {
	time();
}


@Test (dataProvider = "BulkDatas")
private void testCaseOne(String s1, String s2) {
	System.out.println(s1 + s2);
}

@DataProvider (name= "BulkDatas")
private Object[][] datas() {
	return new Object [][] {{"Hai"," welcome "},{"to ","Qbrainx "}, {"an Automation company with ", "AI Instinct "}};	
}

@BeforeMethod
private void executionEnds() {
time();
}
}