public class ContaBancaria{
	private String cliente;
	private int num_conta;
	private double saldo;

	public ContaBancaria(String cliente, int num_conta, double saldo){
		this.cliente = cliente;
		this.num_conta = num_conta;
		this.saldo = saldo;
	}

	public void sacar(double dinheiro){ //Não permitindo saldo negativo		
		
	}

	public void depositar(double dinheiro){

	}

	public String toString(){

	}
}

