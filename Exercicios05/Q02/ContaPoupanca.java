public class ContaPoupanca extends ContaBancaria{
	private int dia_de_rendimento;
	
	public ContaPoupanca(String c, int num, double saldo, int dia){
		super(c,num,saldo);
		dia_de_rendimento = dia;
	}

	public void calcularNovoSaldo(double taxa){

	}

	public String toString(){

	}

}
