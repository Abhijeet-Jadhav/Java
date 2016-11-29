package facade;


/* Client */

public class FacadeDemo {
	public static void main(String[] args) {
		Computer facade = new Computer();
		facade.startComputer();
	}
}