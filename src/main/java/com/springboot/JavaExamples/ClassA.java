package com.springboot.JavaExamples;

public  class ClassA {
String name="PRIYA";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hey hi");
		
		int a=6;
		int b=8;
		int sum =a+b;
		System.out.println(sum);
		System.out.println(sum(a, b));
		ClassB classb=new ClassB();
		System.out.println(classb.mult(a, b));
		System.out.println(classb.mult("a", "b"));
		System.out.println(classb.mult("a"));
		classb.setCarName("AUDI");
		System.out.println(classb.getCarName());
		System.out.println(carmodel());
		System.out.println(classb.carmodel());
		InterfaceA intf1=new ClassC();
		System.out.println(intf1.model());
		
	}
	
	public static int sum(int a, int b) {
		
		int sum=a+b;
		return sum;
	}
	
public static String carmodel() {
		
	ClassB.carModel="Q5";
	return ClassB.carModel;
	}

}
