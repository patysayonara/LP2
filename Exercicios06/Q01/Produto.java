public abstract class Produto{
	private String id;
	private String nome;
	private double preco;
	private String marca;
	private String descricao;
	private String dataFabricacao;

	public Produto(){
		id = "";
		nome = "";
		preco = 0.00;
		marca = "";
		descricao = "Unknown";
		dataFabricacao = "28/08/2018";
	}

	public Produto(String id, String nome, double preco, String marca, String descricao, String dataFabricacao){
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
		this.descricao = descricao;
		this.dataFabricacao = dataFabricacao;
	}

	public String getId(){
		return id;
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
	
	public void print(){
		System.out.println("ID: " + getId() + "\n    " + "Nome: " + getNome() + "\n    "
							+ "Preco: " + getPreco() + "\n    " + "Marca: " + getMarca()
							+ "\n    " + "Descricao: " + getDescricao() + "\n    "
							+ "Data de fabricacao: " + getDataFabricacao());
	}
	
	abstract public boolean disponivelParaVenda();
}
