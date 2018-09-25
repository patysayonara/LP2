public abstract class ProdutoNaoDuravel extends Produto{
	private String dataValidade;
	private String genero;

	public ProdutoNaoDuravel(){
		dataValidade = "28/08/2018";
		genero = "Unknown";
	}

	public ProdutoNaoDuravel(String id, String nome, double preco, String marca, String descricao, String dataFabricacao, String dataValidade, String genero){
		super(id, nome, preco, marca, descricao, dataFabricacao);
		this.dataValidade = dataValidade;
		this.genero = genero;	
	}

	public String getDataValidade(){
		return dataValidade;
	}

	public String getGenero(){
		return genero;
	}
	
	public void print(){
		super.print();
		System.out.println("    Data de validade: " + getDataValidade()
							+ "\n    " + "Genero: " + getGenero());
	}
	
	abstract public boolean naValidade(String data);
}
