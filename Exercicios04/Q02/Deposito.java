import java.util.ArrayList;

public class Deposito extends Produto{
	private ArrayList<Produto> storage;

	public Deposito(){
		storage = new ArrayList<Produto>;
	}

	public void addProduto(Produto produto){
		storage.add(produto);
	}	

	public void rmProduto(){
		
	}

	public int getNumProdutos(){
		return storage.size();
	}

	public boolean isEmpty(){
		if(storage.size() == 0){
			return true;
		} else {
			return false;
		}
	}

	public String biggerValue(){
	
	}
}
