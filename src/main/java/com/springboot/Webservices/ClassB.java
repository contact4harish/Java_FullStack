package com.springboot.Webservices;

public class ClassB extends ClassA{

	int a=5;
	private String CarName;
	public static String carModel;
public int mult(int a, int b) {
		
		int mult=a*b;
		 mult =super.sum(this.a, b);
		return mult;
		
	}
public String mult(String a, String b) {
	
	String add=a+b;
	return add;
	
}
public String mult(String a) {
	
return a;
	
}
public String getCarName() {
	return CarName;
}
public void setCarName(String carName) {
	CarName = carName;
}
public static String carmodel() {
	carModel="Q6";
	return carModel;
}

}
