public class Main{
	public static void main(String[] args){
		ClockDisplay clock = new ClockDisplay();
		clock.setTime(11, 58, "PM");
		String time = clock.getTime();
		System.out.println(time);
		clock.timeTick();
		clock.timeTick();
		time = clock.getTime();
		System.out.println(time);
		clock.timeTick();
		time = clock.getTime();
		System.out.println(time);
	}
}
