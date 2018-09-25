public abstract class ProdutoDuravel extends Produto{
	private String materialPredominante;
	private String durabilidade;

	public ProdutoDuravel(){
		materialPredominante = "";
		durabilidade = "";
	}

	public ProdutoDuravel(String id, String nome, double preco, String marca, String descricao, String dataFabricacao, String materialPredominante, String durabilidade){
		super(id, nome, preco, marca, descricao, dataFabricacao);
		this.materialPredominante = materialPredominante;
		this.durabilidade = durabilidade;
	}

	public String getMaterialPredominante(){
		return materialPredominante;
	}	

	public String getDurabilidade(){
		return durabilidade;
	}

	public void print(){
		super.print();
		System.out.println("    Material predominante: " + getMaterialPredominante()
							+ "\n    " + "Durabilidade: " + getDurabilidade());
	}
	
	abstract public boolean eletronico();
}
