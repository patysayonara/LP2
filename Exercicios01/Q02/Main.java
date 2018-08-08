public class Main{
	public static void main(String[] args){
		Heater machine = new Heater();
		machine.setIncrement(10);
		machine.setMax(30);
		machine.setMin(-30);
		int temp = machine.getTemperature();
		System.out.println(temp);
		machine.Warmer();
		temp = machine.getTemperature();
		System.out.println(temp);
		machine.Warmer();
		machine.Warmer();
		temp = machine.getTemperature();
		System.out.println(temp);
		machine.Cooler();
		temp = machine.getTemperature();
		System.out.println(temp);
		machine.Cooler();
		temp = machine.getTemperature();
		System.out.println(temp);
		machine.Cooler();
		temp = machine.getTemperature();
		System.out.println(temp);
	}
}
