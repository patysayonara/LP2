public class Carro extends Veiculo{
	private int potencia;
	private int quantPortas;

	public Carro(){
		potencia = 0;
		quantPortas = 0;
	}
	
	public Carro(String marca, String modelo, String placa, String situacao, int potencia, int quantPortas){
		super(marca, modelo, placa, 0, situacao);
		this.potencia = potencia;
		this.quantPortas = quantPortas;
	}

	public int getPotencia(){
		return potencia;
	}

	public int getQuantPortas(){
		return quantPortas;
	}

}
