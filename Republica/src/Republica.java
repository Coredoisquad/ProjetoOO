import javax.swing.JOptionPane;

import dadosPessoa.Pessoa;
import dadosPessoa.Despesas;

public class Republica {
	
	private Pessoa pes;
	public Despesas[] desp;

	/************************************************************************* 
	 * Declaracao e implementacao dos metodos
	 *************************************************************************/
	
	// Construtor alternativo
	public Republica(String nomeMorador, String email, float rendimento) {
		pes = new Pessoa(nomeMorador, 
				          email, 
				          rendimento);
	}
	
	public boolean cadastrarDespesas() {
		boolean resposta = false;
		
		String categoria = JOptionPane.showInputDialog(
				"Informe a categoria da Despesa");
		String descricao = JOptionPane.showInputDialog(
				"Informe o nome do Despesa:");
		float valor = Float.parseFloat(
				JOptionPane.showInputDialog(
						"Informe o valor do Despesa:")
				);
		
		Despesas temp = new Despesas();
		temp.setCategoria(categoria);
		temp.setDescricao(descricao);
		temp.setValor(valor);
		
		
		int tamanho = desp.length;
		
		Despesas[] tempDespesas = new Despesas[tamanho+1];
		
		for (int i=0; i<tamanho; i++) {
			tempDespesas[i] = desp[i];
		} //fim da copia de vetores
		
		//adicionar novo Despesas
		int novaPosicao = tamanho;
		tempDespesas[novaPosicao] = temp;
		
		desp = tempDespesas;
		
		resposta = true;
		return resposta;
	}
	
	
	public float totalDespesas() {
		float soma = 0;
		for (Despesas r : desp) {
			soma += r.getValor();
		}
		return soma;
	}
	
	
	public Pessoa getPessoa() {
		return pes;
	}
	
	
	
}