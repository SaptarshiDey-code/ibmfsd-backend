package Day2;

import org.springframework.stereotype.Component;

//@Component
public class Address2 {
	String city;
	String country;
	int pin;
	
	public Address2() {}
	
	public Address2(String city,String country,int pin) {
		this.city=city;
		this.country=country;
		this.pin=pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}

}
