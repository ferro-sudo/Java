package Repl.q221_GetterSetter;

public class TV {
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	String brand = "undefined";

	public TV() {
		System.out.println("Creating TV object using no Args- constructor");
	}

	public TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (!on || channel < 1 || channel > 120) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		} else {
			this.channel = channel;
		}
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if (on == true && volumeLevel > 0 && volumeLevel < 8)
			this.volumeLevel = volumeLevel;
		else
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int channelUp() {
		return channel += 1;
	}

	public int channelDown() {
		return channel -= 1;
	}

	public int volumeUp() {
		return volumeLevel += 1;
	}

	public int volumeDown() {
		return volumeLevel -= 1;
	}

	public boolean isOn() {
		return on;
	}

	public void turnOn() {
		if (on == true)
			System.out.println("TV is already ON");
		else
			on = true;
	}

	public void turnOff() {
		if (on == false)
			System.out.println("TV is already OFF");
		else
			on = false;
	}

}
