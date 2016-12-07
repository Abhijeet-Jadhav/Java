package singleton;

public class SingletonObjectDemo {

	public static void main(String ar[]){
		
		// cannot create object of SingleObject like this
		// SingleObject obj = new SingleObject();
		
		// the only instance which can be accessed
		SingleObject obj = SingleObject.getInstance();
		
		obj.printMessage();
		
	}
}
