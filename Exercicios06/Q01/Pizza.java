public class Pizza extends ProdutoNaoDuravel{
	private String sabor;
	private String tamanho;

	public Pizza(){
		sabor = "Calabresa";
		tamanho = "Media";
	}

	public Pizza(String nome, double preco, String marca, String descricao, String dataFabricacao, String dataValidade, String sabor, String tamanho){
		super(nome, preco, marca, descricao, dataFabricacao, dataValidade, "Alimenticio");
		this.sabor = sabor;
		this.tamanho = tamanho;
	}

	public String getSabor(){
		return sabor;
	}

	public String getTamanho(){
		return tamanho;
	}
}
