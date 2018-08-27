package main.java.com.rodmargon.builder;

public class Computer {
	
	//mandatory attributes
	private String HDD;
	private String RAM;
	
	//optional attributes
	private boolean isGraphicCardsEnabled;
	private boolean isBluetoothEnabled;
	
	public String getHDD() {
		return HDD;
	}
	
	public String getRAM() {
		return RAM;
	}
	
	public boolean isGraphicCardsEnabled() {
		return isGraphicCardsEnabled;
	}
	
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicCardsEnabled = builder.isGraphicCardsEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}
	
	//Builder Class
	public static class ComputerBuilder {
		
		//mandatory attributes
		private String HDD;
		private String RAM;
		
		//optional attributes
		private boolean isGraphicCardsEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String hDD, String rAM) {
			this.HDD = hDD;
			this.RAM = rAM;
		}

		public ComputerBuilder setGraphicCardsEnabled(boolean isGraphicCardsEnabled) {
			this.isGraphicCardsEnabled = isGraphicCardsEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
		
	}
	
}
