package dadosPessoa;


public class Pessoa {
	
	String nome;
	String email;
	float rendimentos;
	
	private Pessoa() {
		
	}
	
	public Pessoa(String n, String e, float r) {
		nome = n;
		email = e;
		rendimentos = r;
	}
}