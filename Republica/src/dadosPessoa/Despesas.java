package dadosPessoa;

public class Despesas {
	private String descricao;
	private float valor;
	private String categoria;
	
	public Despesas() {
	}
	
	Despesas(String c, String d, float v) {
		descricao = d;
		valor = v;
		categoria = c;
	}
	
	public void setCategoria(String c) {
		categoria = c;
	}
	
	public void setDescricao(String d) {
		descricao = d;
	}
	
	public void setValor (float v) {
		valor = v;
	}
	
	public float getValor() {
		return valor;
	}
	
	
}
