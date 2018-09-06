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
		if(dinheiro < 0){
			System.out.println("É inválido tentar sacar uma quantia negativa!");
		} else {
			setSaldo(getSaldo()-dinheiro);
		}
	}

	public void depositar(double dinheiro){
		if(dinheiro < 0){
			System.out.println("Inválido o depósito de quantia negativa.");
		} else {
			setSaldo(getSaldo()+dinheiro);
		}
	}

	public String toString(){

	}

	public void setSaldo(double newSaldo){
		saldo = newSaldo;
	}

	public double getSaldo(){
		return saldo;
	}

	public int getNum_Conta(){
		return num_conta;
	}

	public String getCliente(){
		return cliente;
	}

	public void imprimirDados(){
		System.out.println("Cliente: " + getCliente() + "\n    Numero da conta: " 
				   + getNum_Conta() + "\n    Saldo da conta: " + getSaldo());
	}
}

