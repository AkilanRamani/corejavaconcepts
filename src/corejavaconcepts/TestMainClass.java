package corejavaconcepts;

public class TestMainClass {

	public static void main(String[] args) {
	
	//test.accept(12);// The child class Object can be upcasted to the Parent implemented Interface Type and that interface Type reference can be used to access the method that are defined and Implemented in Child Class.
	//the parent interface reference refers to the child class object and hence forth it can be used to access the Child class Properties that is methods and Variables.
		Testing<Integer> integer = new DialogTest();
		integer.test(integer);
		
	
		}
		
	
	}
	

