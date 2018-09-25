public class Refrigerante extends ProdutoNaoDuravel{
	private String sabor;
	private double litros;

	public Refrigerante(){
		sabor = "Cola";
		litros = 2;
	}

	public Refrigerante(String nome, double preco, String marca, String descricao, String dataFabricacao, String dataValidade, String sabor, double litros){
		super(nome, preco, marca, descricao, dataFabricacao, dataValidade, "Alimenticio");
		this.sabor = sabor;
		this.litros = litros;
	}

	public String getSabor(){
		return sabor;
	}

	public double getLitros(){
		return litros;
	}

}
