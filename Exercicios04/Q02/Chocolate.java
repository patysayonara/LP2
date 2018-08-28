public class Chocolate extends ProdutoNaoDuravel{
	private String sabor;	
	private int gramas;

	public Chocolate(){
		sabor = "Ao leite";
		gramas = 100;
	}

	public Chocolate(String nome, double preco, String marca, String descricao, String dataFabricacao, String dataValidade, String sabor, int gramas){
		super(nome, preco, marca, descricao, dataFabricacao, dataValidade, "Alimenticio");
		this.sabor = sabor;
		this.gramas = gramas;	
	}

	public String getSabor(){
		return sabor;
	}

	public int getGramas(){
		return gramas;
	}

}
