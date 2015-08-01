package com.aspect.methods.impl;

import com.aspect.methods.ExampleMethods;

public class ExampleMethodImpl implements ExampleMethods {

	int c;
	
	@Override
	public int sum(int a, int b) {
		c = a+b;
		return c;
	}

	@Override
	public int multiply(int a, int b) {
		c = a*b;
		return c;
	}

	@Override
	public int divide(int a, int b) {
		c =a/b;
		return c;
	}

}
