public class Carro extends ProdutoDuravel{
	private String cor;
	private String placa;

	public Carro(){
		this.cor = "Black";
		this.placa = "Unknown";
	}

	public Carro(String nome, double preco, String marca, String descricao, String dataFabricacao, String materialPredominante, String durabilidade, String cor, String placa){
		super(nome, preco, marca, descricao, dataFabricacao, materialPredominante, durabilidade);
		this.cor = cor;
		this.placa = placa;
	}

	public String getCor(){
	 	return cor;
	}

	public String getPlaca(){
		return placa;
	}

}
