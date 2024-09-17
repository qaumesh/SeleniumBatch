package com.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.GetProperty;

public class ParameterAnnotations {

	@Parameters({ "zipCode" })
	@Test 
	public void test(String zipCode ) throws Throwable {
		System.out.println("zipCode :"+zipCode);
	}
}

// com.parameter.ParameterAnnotations