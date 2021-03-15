package com.class14;

public class CalculatorTester {

	public static void main(String[] args) {
		
		Calculator calc=new Calculator();
		System.out.println(calc.add(10, 12));
		double result=calc.sub(15.5, 10);
		System.out.println(result);
	}

}
