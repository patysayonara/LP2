public class ProfessorIntegral extends Professor{
	private double salario;

	public ProfessorIntegral(){
		salario = 1000.00;
	}
	
	public ProfessorIntegral(String nome, String matricula, int idade, double salario){
		super(nome, matricula, idade);
		this.salario = salario;
	}	

	public double getSalario(){
		return salario;
	}

}
