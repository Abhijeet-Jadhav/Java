package designpatterns;// pass by reference or pass by value

public class Dog {
	
	String name ;

	public Dog(String string) {
		// TODO Auto-generated constructor stub
		name = string;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String m){
		this.name = m;
	}

	public static void foo(Dog d) {
	    d.getName().equals("Max"); // true

	    d = new Dog("Fifi");
	    d.getName().equals("Fifi"); // true
	}
	
	public static void changeName(Dog d){
		d.getName().equals("Max"); // true
	    d.setName("Fifi");
	}
	
	public static void main( String[] args ){
	    Dog aDog = new Dog("Max");
	    foo(aDog);

	    if (aDog.getName().equals("Max")) { //true
	        System.out.println( "Java passes by value." );

	    } else if (aDog.getName().equals("Fifi")) {
	        System.out.println( "Java passes by reference." );
	    }
	    
	    changeName(aDog);

	    if (aDog.getName().equals("Max")) { //true
	        System.out.println( "Java passes by value." );

	    } else if (aDog.getName().equals("Fifi")) {
	        System.out.println( "In java references are passed by value." );
	    }
	    
	    /* Java Spec says that everything in Java is pass-by-value. There is no such thing as "pass-by-reference" in Java.
	     * 
	     * Java works exactly like C. You can assign a pointer, pass the pointer to a method, 
	     * follow the pointer in the method and change the data that was pointed to. 
	     * However, you cannot change where that pointer points.
		 *
		 *	In C++, Ada, Pascal and other languages that support pass-by-reference, 
		 *	you can actually change the variable that was passed.
	     * 
	     */
	}

	
}
