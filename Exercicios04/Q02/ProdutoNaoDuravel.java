public class ProdutoNaoDuravel extends Produto{
	private String dataValidade;
	private String genero;

	public ProdutoNaoDuravel(){
		dataValidade = "28/08/2018";
		genero = "Unknown";
	}

	public ProdutoNaoDuravel(String nome, double preco, String marca, String descricao, String dataFabricacao, String dataValidade, String genero){
		super(nome, preco, marca, descricao, dataFabricacao);
		this.dataValidade = dataValidade;
		this.genero = genero;	
	}

	public String getDataValidade(){
		return dataValidade;
	}

	public String getGenero(){
		return genero;
	}
}
