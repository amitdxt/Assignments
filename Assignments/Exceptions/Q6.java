

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) throws LowerRAMSizeException,HardDiskException, HardDiskNotSupportedException {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter processor :");
		String processor = scn.nextLine();
		System.out.println("Enter RAM :");
		int RAM = scn.nextInt();
		System.out.println("Enter SDD :");
		int SDD = scn.nextInt();
		System.out.println("Enter HDD :");
		int HDD = scn.nextInt();
		AssemblySystem as = new AssemblySystem(processor, RAM, SDD, HDD);
		
		if ( (as.getProcessor().equalsIgnoreCase("I3") || as.getProcessor().equalsIgnoreCase("I5")
				|| as.getProcessor().equalsIgnoreCase("I7")||as.getProcessor().equalsIgnoreCase("I1") || 
				as.getProcessor().equalsIgnoreCase("I2")|| as.getProcessor().equalsIgnoreCase("I4") )
				&& as.getRAM()>=4 )
		{
			System.out.println("Processor & RAM is Good to buy.");
		} else {
			throw new LowerRAMSizeException("Entered RAM size is lower RAM than the recommended RAM.");
		}

		if ( (as.getProcessor().equalsIgnoreCase("I3") || as.getProcessor().equalsIgnoreCase("I5")
				|| as.getProcessor().equalsIgnoreCase("I7")||as.getProcessor().equalsIgnoreCase("I1") || 
				as.getProcessor().equalsIgnoreCase("I2")|| as.getProcessor().equalsIgnoreCase("I4") )
				&& as.getHDD()>=160 )
		{
			System.out.println("Processor & HDD is Good to buy.");
		} else {
			throw new HardDiskException("Entered HDD size is not matched with recommended HDD.");
		}

		if ( (as.getProcessor().equalsIgnoreCase("I1") || as.getProcessor().equalsIgnoreCase("I2")
				|| as.getProcessor().equalsIgnoreCase("I4") )&& as.getSDD()>=250 )
		{
			System.out.println("Processor & SDD is Good to buy.");
		} else {
			throw new HardDiskNotSupportedException("Entered SDD size is not matched with recommended SDD.");
		}
	}

}

class AssemblySystem {
	private String processor;
	private int RAM;
	private int SDD;
	private int HDD;
	public AssemblySystem(String processor, int rAM, int sDD, int hDD) {
		super();
		this.processor = processor;
		RAM = rAM;
		SDD = sDD;
		HDD = hDD;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public int getSDD() {
		return SDD;
	}
	public void setSDD(int sDD) {
		SDD = sDD;
	}
	public int getHDD() {
		return HDD;
	}
	public void setHDD(int hDD) {
		HDD = hDD;
	}
	@Override
	public String toString() {
		return "AssemblySystem [processor=" + processor + ", RAM=" + RAM + ", SDD=" + SDD + ", HDD=" + HDD + "]";
	}

}

class LowerRAMSizeException extends Exception {
	private static final long serialVersionUID = 1L;

	public LowerRAMSizeException(String s) {
		super(s);
	}
}

class HardDiskException extends Exception {
	private static final long serialVersionUID = 1L;

	public HardDiskException(String s) {
		super(s);
	}
}

class HardDiskNotSupportedException extends Exception {
	private static final long serialVersionUID = 1L;

	public HardDiskNotSupportedException(String s) {
		super(s);
	}
}