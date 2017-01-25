package designpatterns.singleton;

public class SingleObject {

	// create an object of SingleObject
	private static SingleObject instance = new SingleObject();
	
	// private constructor so that this class cannot be instantiated
	private SingleObject(){}
	
	// public method to get access of only object 
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void printMessage(){
		System.out.println("method of singleton class called");
	}
	
}
