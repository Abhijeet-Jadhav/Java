package designpatterns.facade;


/* Client */

public class FacadeDemo {
	public static void main(String[] args) {
		Computer facade = new Computer();
		facade.startComputer();
	}
}

/* NOTES
 
 Facade is structural pattern
 Deemphasizes IS-A relationship and emphasizes HAS-A relationship
 
 
 */
