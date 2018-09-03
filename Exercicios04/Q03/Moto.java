public class Moto extends Veiculo{
	private double cilindradas;
	private String partida;

	public Moto(){
		cilindradas = 0.0;
		partida = "Desconhecido";
	}

	public Moto(String marca, String modelo, String placa, String situacao, double cilindradas, String partida){
		super(marca, modelo, placa, 1, situacao);
		this.cilindradas = cilindradas;
		this.partida = partida;
	}

	public double getCilindradas(){
		return cilindradas;
	}

	public String getPartida(){
		return partida;
	}

}
