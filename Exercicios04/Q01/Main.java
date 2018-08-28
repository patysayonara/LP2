public class Main{
	public static void main(String[] args){
		ProfessorIntegral profIntegral = new ProfessorIntegral("Renata", "2017099654", 26, 2000.00);
		ProfessorHorista profHorista = new ProfessorHorista("Marcos", "2018762109", 24, 20,"50.00");
		
		System.out.println("Salario de " + profIntegral.getNome() + ": " + profIntegral.getSalario());
		System.out.println("Salario de " + profHorista.getNome() + ": " + profHorista.Salario());
	}
}
