package com.startup.main;

import java.util.Scanner;

import com.startup.serviceimpl.CalculationServiceImpl;

public class FibonacciRecursionTest {
	public static void main(String[] args) {
		CalculationServiceImpl obj=new CalculationServiceImpl();
		System.out.println("Enter a number :");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		obj.fibonacci(x);
	}

}
