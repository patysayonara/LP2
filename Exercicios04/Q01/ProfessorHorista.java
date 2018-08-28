public class ProfessorHorista extends Professor{
	private int total_horas;
	private String salario_hora;

	public ProfessorHorista(){
		total_horas = 20;
		salario_hora = "30.00";
	}

	public ProfessorHorista(String nome, String matricula, int idade, int total_horas, String salario_hora){
		super(nome, matricula, idade);
		this.total_horas = total_horas;
		this.salario_hora = salario_hora;
	}	

	public int getTotal_Horas(){
		return total_horas;
	}

	public String getSalario_Hora(){
		return salario_hora;
	}

	public double Salario(){
		return total_horas*Double.valueOf(getSalario_Hora());
	}
	
}
