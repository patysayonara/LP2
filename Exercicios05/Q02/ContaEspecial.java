public class ContaEspecial extends ContaBancaria{
	private double limite;

	public ContaEspecial(String c, int num, double saldo, double limite){
		super(c,num,saldo);
		this.limite = limite;
	}

	public void sacar(double dinheiro){ //Permitindo saldo negativo até o valor limite

	}

	public String toString(){

	}
}
