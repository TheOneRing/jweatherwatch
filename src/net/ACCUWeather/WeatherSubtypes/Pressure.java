package net.ACCUWeather.WeatherSubtypes;

import org.w3c.dom.Element;

public class Pressure {
	float pressure;
	String state;

	public Pressure(Element element) {
		pressure = Float.valueOf(element.getElementsByTagName("pressure")
				.item(0).getChildNodes().item(0).getNodeValue());
		state = ((Element) element.getElementsByTagName("pressure").item(0))
				.getAttribute("state");
	}

	public double getPressure() {
		return pressure;
	}

	public String getState() {
		return state;
	}

	public String toString() {
		return state + " " + pressure+" "+UnitCode.pressure();
	}
	
	
	public boolean equals(Pressure p) {
	return pressure==p.pressure&&state.equals(p.state);
	}

}
