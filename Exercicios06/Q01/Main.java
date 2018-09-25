public class Main{
	public static void main(String[] args){
		Deposito deposito = new Deposito();
		boolean checkDeposito = deposito.isEmpty();
		if(checkDeposito == true){		
			System.out.println("The storage is empty.");
		} else {
			System.out.println("The storage is not empty.");
		}
		Livro book = new Livro("Orgulho e Preconceito", 29.90, "Martin Claret", "Clássico da literatura", "1863", "Papel", "Muitos anos", "Jane Austen");
		deposito.addProduto(book);
		Pizza pizza = new Pizza("Pizza de calabresa do Habbib's", 19.90, "Habbib's", "Pizza de calabresa", "28/08/2018", "29/08/2018", "Calabresa", "Média");
		deposito.addProduto(pizza);
		int numProdutos = deposito.getNumProdutos();
		System.out.println("Number of products in storage: " + numProdutos);
		deposito.highestValue();
		deposito.rmProduto();
		numProdutos = deposito.getNumProdutos();
		System.out.println("Number of products in storage: " + numProdutos);
	}
}
