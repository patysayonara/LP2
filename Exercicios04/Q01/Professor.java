public class Professor{
	private String nome;
	private String matricula;
	private int idade;

	public Professor(){
		nome = "";
		matricula = "";
		idade = 30;
	}

	public Professor(String nome, String matricula, int idade){
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
	}

	public String getNome(){
		return nome;
	}

	public String getMatricula(){
		return matricula;
	}

	public int getIdade(){
		return idade;
	}
}
