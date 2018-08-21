import java.util.ArrayList;	

public class Turma{
	private ArrayList<Aluno> turma;  
		
	public Turma(){
		turma = new ArrayList<Aluno>();
	}
	
	public void storeAluno(Aluno aluno){
		turma.add(aluno);
	}
	
	public double calcularMedia(){
		double mediaTurma = 0.0;		
		for(Aluno aluno : turma){
			mediaTurma += aluno.getMediaFinal();	
		}
		return (mediaTurma/turma.size());
	}

}
