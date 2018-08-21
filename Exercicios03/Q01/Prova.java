public class Prova{
	private double notaParte1;
	private double notaParte2;
	
	public Prova(double nota1, double nota2){
		notaParte1 = nota1;
		notaParte2 = nota2;
	}

	public double calcularNotaTotal(){
		double notaFinal;
		notaFinal = notaParte1 + notaParte2;
		if(notaFinal > 10){
			System.out.println("Foram informados valores que ultrapassam 10 ao serem somados. Tente novamente!");
			return -1;
		}
		return notaFinal;
	}	

}
