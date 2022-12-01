package com.example.assigment.exception;

import java.io.IOException;

public class Q7_ExceptionChaning {
	public static void main(String[] args) {
		try {
			
			ArithmeticException e = new ArithmeticException("Apparent cause"); 
			
			e.initCause(new IOException("Actual cause"));   
			
			throw e;												
		} catch (ArithmeticException e) {
			
			System.out.println(e.getCause());						
		}
	}
}
