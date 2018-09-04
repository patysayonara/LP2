import java.util.ArrayList;

public class Database{
	private ArrayList<Cliente> database;

	public Database(){
		database = new ArrayList<Cliente>();
	}

	public void addCliente(Cliente client){
		database.add(client);
	}

	public void showClientes(){
		for(Cliente client: database){
			if(client instanceof PessoaFisica){
				client.imprimirDados();
			} else if(client instanceof PessoaJuridica){
				client.imprimirDados();
			}
		}
	}

	public int numClientes(){
		return database.size();
	}

	public int numPessoasFisicas(){
		int count = 0;	
		for(Cliente client: database){
			if(client instanceof PessoaFisica){
				count++;	
			}
		}
		return count;
	}

	public int numPessoasJuridicas(){
		int count = 0;
		for(Cliente client: database){
			if(client instanceof PessoaJuridica){
				count++;
			}
		}
		return count;
	}
}
