package ch07.sec02;

public class C06Polymorphism {
	public static void main(String[] args) {
		Sub06 o1 = new Sub06();
//		Sub06 o2 = new Super06(); //XX 강제형번환필요
		Sub06 o2 = (Sub06)new Super06();
		
		Super06 o3 = new Sub06();
		
		Super06 o4 = o1;
		
		
	}
}
