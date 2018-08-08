/**
* Program that simulates a Heater.
*/
public class Heater{
	// The current temperature
	private int temperature;
	// The minimum temperature allowed by the heater 
	private int min;
	// The maximum temperature allowed by the heater 
	private int max;
	// The value that is going to either decrease the temperature or increase it
	private int increment;

	public Heater(){
		temperature = 15;		
		increment = 5;
	}
	
	/**
	* Insert the maximum temperature
	*/
	public void setMax(int max){
		this.max = max;
	}

	/**
	* Insert the minimum temperature
	*/
	public void setMin(int min){
		this.min = min;
	}
	
	/**
	* Increase the temperature
	*/
	public void Warmer(){
		if(temperature + increment > max){
			System.out.println("You can not elevate the temperature above " + max + " degrees.");
		} else {
			temperature += increment;
		}
	}

	/**	
	* Decrease the temperature
	*/
	public void Cooler(){
		if(temperature - increment < min){
			System.out.println("You can not lower the temperature under " + min + " degrees.");
		} else {		
			temperature -= increment;
		}
	}

	/**
	* Return the current temperature
	*/
	public int getTemperature(){
		return temperature;
	}
	
	/**
	* Insert the increment
	*/
	public void setIncrement(int increment){
		if(increment < 0){
			System.out.println("You can not iniciate the increment with a negative number.");
		} else {
			this.increment = increment;
		}
	}
}
