package main.java.com.rodmargon.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		// Using builder to get an object without any inconsistency or argument
		// management issues
		Computer computer = new Computer.ComputerBuilder("500 GB", "4 GB").setBluetoothEnabled(false)
				.setGraphicCardsEnabled(true).build();
		
		System.out.println("Computer´s HDD " + computer.getHDD());
		System.out.println("Computer´s RAM " + computer.getRAM());

	}

}
