import java.util.ArrayList;

public class Banco{
	private ArrayList<ContaBancaria> bank;

	public Banco(){
		bank = new ArrayList<ContaBancaria>();
	}

	public void addConta(ContaBancaria conta){
		bank.add(conta);
	}

	public void detalhesContas(){
		for(ContaBancaria current: bank){
			current.imprimirDados();
		}
	}
}



