import java.util.ArrayList;

public class Deposito extends Produto{
	private ArrayList<Produto> storage;

	public Deposito(){
		storage = new ArrayList<Produto>;
	}

	public void addProduto(Produto produto){
		storage.add(produto);
	}	

}
