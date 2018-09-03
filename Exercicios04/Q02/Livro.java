public class Livro extends ProdutoDuravel{
	private String autor;
	private String editora;

	public Livro(){
		autor = "Unknown";
	}

	public Livro(String nome, double preco, String marca, String descricao, String dataFabricacao, String materialPredominante, String durabilidade, String autor){
		super(nome, preco, marca, descricao, dataFabricacao, materialPredominante, durabilidade);
		this.autor = autor;
	}

	public String getAutor(){
		return autor;
	}

}
