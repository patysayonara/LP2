public class Aluno{
		
	private double mediaFinal;

	public void calcularMedia(Prova prova1, Prova prova2){
		mediaFinal = (prova1.calcularNotaTotal() + prova2.calcularNotaTotal())/2;
	}

	public double getMediaFinal(){
		return mediaFinal;
	}	

}
