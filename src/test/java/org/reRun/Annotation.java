package org.reRun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Annotation implements IAnnotationTransformer {

	public void transform(ITestAnnotation connecter, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer retryAnalyzer = connecter.getRetryAnalyzer();
		if (retryAnalyzer==null) {
			connecter.setRetryAnalyzer(Retry.class);
		}
		
	}

}
