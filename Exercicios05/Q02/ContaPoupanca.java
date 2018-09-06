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

	public int getDia_De_Rendimento(){
		return dia_de_rendimento;
	}

	public void imprimirDados(){
		super.imprimirDados();
		System.out.println("\n    Dia de rendimento: " + getDia_De_Rendimento());
	}
}
