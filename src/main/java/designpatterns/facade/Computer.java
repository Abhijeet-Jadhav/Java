package designpatterns.facade;

class Computer {
	HardDrive hardDrive = new HardDrive();
	Memory memory = new Memory();
	CPU cpu = new CPU();
	int BOOT_ADDRESS =1;
	int SECTOR_SIZE = 2;
	int BOOT_SECTOR=3;
	public void startComputer() {
		cpu.freeze();
		memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
		cpu.jump(BOOT_ADDRESS);
		cpu.execute();
	}
}
