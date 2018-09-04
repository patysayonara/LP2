import java.util.ArrayList;

public class Locavel{
	private ArrayList<Veiculo> storage;

	public Locavel(){
		storage = new ArrayList<Veiculo>();
	}

	public void exibirVeiculos(int key){ //key = 0 para todos os carros e motos; key = 1 para os alugáveis; ou key = 3 para os alugados
        for(Veiculo current1: storage){
            if(current1.getIdentificador() == 0){
                Carro car = new Carro();
                car = (Carro)current1;
                if(key == 0){
                    System.out.println("    Carro modelo: " + car.getModelo() + "\n   Marca: " + car.getMarca() + "\n   Placa: "
                                    + car.getPlaca() + "\n   Potencia: " + car.getPotencia + "\n   Quantidade de portas: "
                                    + car.getQuantPortas() + "\n   Status: " + car.getSituacao() + "\n");
                } else if(key == 1){
                    if(car.getSituacao().equals("Alugavel")){
                        System.out.println("    Carro modelo: " + car.getModelo() + "\n   Marca: " + car.getMarca() + "\n   Placa: "
                                    + car.getPlaca() + "\n   Potencia: " + car.getPotencia + "\n   Quantidade de portas: "
                                    + car.getQuantPortas() + "\n   Status: " + car.getSituacao() + "\n");
                    }
                } else if(key == 2){
                    if(car.getSituacao().equals("Alugado")){
                        System.out.println("    Carro modelo: " + car.getModelo() + "\n   Marca: " + car.getMarca() + "\n   Placa: "
                                    + car.getPlaca() + "\n   Potencia: " + car.getPotencia + "\n   Quantidade de portas: "
                                    + car.getQuantPortas() + "\n   Status: " + car.getSituacao() + "\n");
                    }
                }
            }
        }
        for(Veiculo current2: storage){
            if(current2.getIdentificador() == 1){
                Moto motorbike = new Moto();
                motorbike = (Moto)current2;
                if(key == 0){
                    System.out.println("    Modelo: " + motorbike.getModelo() + "\n   Marca: " + motorbike.getMarca() + "\n   Placa: "
                                    + motorbike.getPlaca() + "\n   Cilindradas: " + motorbike.getCilindradas() + "\n   Tipo de partida: "
                                    + motorbike.getPartida() + "\n   Status: " + motorbike.getSituacao() + "\n");
                } else if(key == 1){
                    if(motorbike.getSituacao().equals("Alugavel")){
                        System.out.println("    Modelo: " + motorbike.getModelo() + "\n   Marca: " + motorbike.getMarca() + "\n   Placa: "
                                    + motorbike.getPlaca() + "\n   Cilindradas: " + motorbike.getCilindradas() + "\n   Tipo de partida: "
                                    + motorbike.getPartida() + "\n   Status: " + motorbike.getSituacao() + "\n");
                    }
                } else if(key == 2){
                    if(motorbike.getSituacao().equals("Alugado")){
                        System.out.println("    Modelo: " + motorbike.getModelo() + "\n   Marca: " + motorbike.getMarca() + "\n   Placa: "
                                    + motorbike.getPlaca() + "\n   Cilindradas: " + motorbike.getCilindradas() + "\n   Tipo de partida: "
                                    + motorbike.getPartida() + "\n   Status: " + motorbike.getSituacao() + "\n");
                    }
                }
            }
        }

	}



	public void alugar(){
        exibirVeiculos(1);
	}

}
