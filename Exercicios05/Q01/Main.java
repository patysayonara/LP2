public class Main{
	public static void main(String[] args){
		Database database = new Database();
		PessoaFisica pf = new PessoaFisica("João", "Lagoa Nova", "999357928", "72946827354");
		PessoaJuridica pj = new PessoaJuridica("Renata", "Neopolis", "991663858", "238572893", "Realize");
		database.addCliente(pf);
		database.addCliente(pj);
		System.out.println("Todos: " + database.numClientes());
		System.out.println("PF: " + database.numPessoasFisicas());
		System.out.println("PJ: " + database.numPessoasJuridicas());
		database.showClientes();
	}
}
