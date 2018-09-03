public class Veiculo{
	private String marca;
	private String modelo;
	private String placa;
	private int identificador; //0 para carro e 1 para moto
	private String situacao;

	public Veiculo(){
		marca = "Desconhecido";
		modelo = "Desconhecido";
		placa = "Desconhecido";
		identificador = 0;
		situacao = "Desconhecido";

	}

	public Veiculo(String marca, String modelo, String placa, int identificador, String situacao){
		this.marca = marca;
		this.modelo = modelo;	
		this.placa = placa;
		this.identificador = identificador;
		this.situacao = situacao;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public String getModelo(){
		return modelo;
	}

	public String getPlaca(){
		return placa;
	}

	public int getIdentificador(){
		return identificador;
	}

	public String getSituacao(){
		return situacao;
	}

}
