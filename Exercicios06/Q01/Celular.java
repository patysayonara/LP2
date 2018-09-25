public class Celular extends ProdutoDuravel{
	private int memoriaGB;

	public Celular(){
		memoriaGB = 36;
	}

	public Celular(String nome, double preco, String marca, String descricao, String dataFabricacao, String materialPredominante, String durabilidade, int memoriaGB){
		super(nome, preco, marca, descricao, dataFabricacao, materialPredominante, durabilidade);
		this.memoriaGB = memoriaGB;
	}

	public int getMemoriaGB(){
		return memoriaGB;
	}
}
