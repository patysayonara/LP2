public class Main{
	public static void main(String[] args){
		Turma turma = new Turma();
		
		Aluno aluno1 = new Aluno();
		Prova prova1A1 = new Prova(4.0, 2.5);
		Prova prova2A1 = new Prova(1.0, 7.0);
		aluno1.calcularMedia(prova1A1, prova2A1);
		System.out.println("Media do aluno 1 foi: " + aluno1.getMediaFinal());
		
		Aluno aluno2 = new Aluno();
		Prova prova1A2 = new Prova(6.5, 3.5);
		Prova prova2A2 = new Prova(0.0, 3.0);
		aluno2.calcularMedia(prova1A2, prova2A2);
		System.out.println("Media do aluno 2 foi: " + aluno2.getMediaFinal());

		Aluno aluno3 = new Aluno();
		Prova prova1A3 = new Prova(5.0, 4.0);
		Prova prova2A3 = new Prova(6.0, 1.5);
		aluno3.calcularMedia(prova1A3, prova2A3);
		System.out.println("Media do aluno 3 foi: " + aluno3.getMediaFinal());
		
		
		turma.storeAluno(aluno1);
		turma.storeAluno(aluno2);
		turma.storeAluno(aluno3);

		double mediaFinal = turma.calcularMedia();
		System.out.println("A media final da turma foi: " + mediaFinal);		
	}
}
