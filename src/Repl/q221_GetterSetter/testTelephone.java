package Repl.q221_GetterSetter;


public class testTelephone {

	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.turnOff();
		tv.turnOff();
		tv.setVolumeLevel(5);
		tv.setChannel(75);
		tv.channelDown();
		System.out.println(tv.isOn());
		

	}

}
