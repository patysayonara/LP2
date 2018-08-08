public class Main{
	public static void main(String[] args){
		Celular cel = new Celular();
		int temp = cel.getSaldo();
		System.out.println(temp);
		cel.setSaldo(2000);
		temp = cel.getSaldo();
		System.out.println(temp);
		cel.topUp(100);
		temp = cel.getSaldo();
		System.out.println(temp);
		cel.topUp(-10);
		cel.consumir(200);
		temp = cel.getSaldo();
		System.out.println(temp);
		cel.consumir(2500);
	}
}
