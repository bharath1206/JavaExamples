package com.test;

public class HelloWorld {
		
	
	private static String name = "Padma";
	private int x = 4;
	private int y = 5;
	
	public static void main(String[] args) {
		
		System.out.println("Hello! World--"+name);
		
		
//		HelloWorld obj = new HelloWorld();
//		
//		int calSUm = obj.sum();
//		
//		System.out.println("Sum of Two Values---"+calSUm);
//		
//		
//		int calSumPassingValues = obj.sum(10, 20);
//		
//		System.out.println("Sum of Two Values dynamically Calculated---"+calSumPassingValues);
		
		
		
		Family familyObj = new Parent();
		familyObj.mone();
		
		
//		Child childObj = new Child();
//		
//		childObj.mone();
		
		
	}
	
	
	public int sum() {
		
		int z = 5;
		
		int sumOfTwo = x + y + z;
		
		return sumOfTwo;
		
	}
	
	
	public int sum(int a, int b) {
		
		
		
		int sumOfTwo = a + b;
		
		return sumOfTwo;
		
	}
	
	

}
