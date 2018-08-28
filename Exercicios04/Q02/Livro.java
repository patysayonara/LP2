public class Livro extends ProdutoDuravel{
	private String autor;
	private String editora;

	public Livro(){
		autor = "Unknown";
		editora = "Unknown";
	}

	public Livro(String nome, double preco, String marca, String descricao, String dataFabricacao, String materialPredominante, String durabilidade, String autor, String editora){
		super(nome, preco, marca, descricao, dataFabricacao, materialPredominante, durabilidade);
		this.autor = autor;
		this.editora = editora;
	}

	public String getAutor(){
		return autor;
	}

	public String getEditora(){
		return editora;
	}

}
