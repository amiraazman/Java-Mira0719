class Lamp{
	boolean isOn;

	void turnOn(){
		isOn = true;
	}

	void turnOff(){
		isOn = false;
	}

	void displayLightStatus(){
		System.out.println("Light on?" + isOn);
	}
}

