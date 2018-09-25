import java.util.ArrayList;
import java.util.Scanner;

public class Deposito extends Produto{
	private ArrayList<Produto> storage;
	private Scanner scan;

	public Deposito(){
		storage = new ArrayList<Produto>();
		scan = new Scanner(System.in);
	}

	public void addProduto(Produto produto){
		storage.add(produto);
	}	

	public void rmProduto(){
		System.out.println("These are the products in storage:");
		for(Produto item: storage){
			System.out.println(storage.indexOf(item) + " - " + item.getNome());
		}	
		System.out.println("Please inform the number that corresponds to the item of choice:");
		System.out.print("> ");
		int toBeDeleted = scan.nextInt();
		if(toBeDeleted < 0 || toBeDeleted >= storage.size()){
			System.out.println("Invalid number!");
		} else {
			storage.remove(toBeDeleted);
		}
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

	public void highestValue(){
		double highest = 0.00;
		int index = 0;
		for(Produto item: storage){
			if(item.getPreco() > highest){
				highest = item.getPreco();
				index = storage.indexOf(item);
			}
		}
		System.out.println("Product with the highest value is: " + storage.get(index).getNome());
	}
}
