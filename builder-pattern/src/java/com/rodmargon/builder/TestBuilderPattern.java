package java.com.rodmargon.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		// Using builder to get an obejct without any inconsistency or argument
		// management issues
		Computer computer = new Computer.ComputerBuilder("500 GB", "4 GB").setBluetoothEnabled(false)
				.setGraphicCardsEnabled(true).build();

	}

}
