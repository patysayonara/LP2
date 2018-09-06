public class ContaEspecial extends ContaBancaria{
	private double limite;

	public ContaEspecial(String c, int num, double saldo, double limite){
		super(c,num,saldo);
		this.limite = limite;
	}

	public void sacar(double dinheiro){ //Permitindo saldo negativo até o valor limite
		if(dinheiro < 0 && dinheiro >= getLimite()){		
			int transicao = sacar.getSaldo();
			transicao -= dinheiro;	
			super.setSaldo(transicao);
		} else {
			super.sacar(dinheiro);
		}	
	}

	public String toString(){

	}

	public double getLimite(){
		return limite;
	}

	public void imprimirDados(){
		super.imprimirDados();
		System.out.println("\n    Limite da conta: " + getLimite());
	}
}
