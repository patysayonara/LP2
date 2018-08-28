//Desenhar o diagrama de classes!!
public class Produto{
	private String nome;
	private double preco;
	private String marca;
	private String descricao;
	private String dataFabricacao;

	public Produto(){
		nome = "";
		preco = 0.00;
		marca = "";
		descricao = "Unknown";
		dataFabricacao = "28/08/2018";
	}

	public Produto(String nome, double preco, String marca, String descricao, String dataFabricacao){
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
		this.descricao = descricao;
		this.dataFabricacao = dataFabricacao;
	}

	public String getNome(){
		return nome;
	}

	public double getPreco(){
		return preco;
	}

	public String getMarca(){
		return marca;
	}

	public String getDescricao(){
		return descricao;
	}

	public String getDataFabricacao(){
		return dataFabricacao;
	}
}
