package designpatterns.facade;

class HardDrive {
	byte data[] = new byte[30];
	   
	public byte[] read(long lba, int size) {
		System.out.println("reading HDD");
		return data;
		
	}
}
