package designpatterns.facade;

class Memory {
	public void load(long position, byte[] data) {
		System.out.println("load in memory");
	}
}
