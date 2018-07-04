import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Principal {
	
	static Republica[] moradores = new Republica[0];

	public static void main (String[] args) throws IOException {
	
		//Menu de opcoes
		Object[] opcoesPossiveis = {"--- Selecione uma opcao ---",
									"Cadastrar Morador", 
				                    "Cadastrar Despesas",
				                    "Calcular Pagamento Porporcional",
				                    "Calcular Pagamento Igualitario", 
				                    "Sair"};
		Object opcaoDefault = opcoesPossiveis[0];
		Object opcaoSelecionada = null;
		do {
			opcaoSelecionada = JOptionPane.showInputDialog(null, 
											"Selecione uma das opcoes a seguir:", 
											"Calculo de Pagamento", 
											JOptionPane.QUESTION_MESSAGE, 
											null, 
											opcoesPossiveis, 
											opcaoDefault);
			switch ((String) opcaoSelecionada) {
			case "Cadastrar Morador":
				cadastrarMorador();
			    break;
			
		//	case "Cadastrar Despesas":
		//		cadastrarDespesas();
		//		break;
			
			default:
				break;
			}
		} while (!((String)opcaoSelecionada).equals((String)opcoesPossiveis[5]));
	}
		
		private static Republica cadastrarMorador() throws IOException {
		
		String nomeMorador = JOptionPane.showInputDialog("Informe o nome do Morador:");
		String emailMorador = JOptionPane.showInputDialog("Informe o email do Morador:");
		String rendimentoMorador = JOptionPane.showInputDialog("Informe o rendimento do Morador");
		
		FileWriter arq = new FileWriter("C:\\Users\\Usuário\\Desktop\\Moradores.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
	    
	    gravarArq.printf("Nome do morador: %s %n", nomeMorador);
	    gravarArq.printf("Email do morador: %s %n", emailMorador);
	    gravarArq.printf("rendimentoMorador: R$ %s %n", rendimentoMorador);
	    gravarArq.printf("----------------------%n");
	    
	    arq.close();
	    
		float rendmorador = Float.parseFloat(rendimentoMorador);
		
		//Instanciacao do objeto Republica (=Morador)
		Republica cidadao = new Republica(nomeMorador, 
				                emailMorador, 
				                rendmorador);
		
		//Armazenamento do objeto morador no vetor de Moradores
		int qtdeMoradoresAtual = moradores.length;
		int novaQtdeMoradores = qtdeMoradoresAtual + 1;
		Republica[] temp = new Republica[novaQtdeMoradores];
		
		for (int i=0; i<qtdeMoradoresAtual; i++) {
			temp[i] = moradores[i];
		}
		
		temp [novaQtdeMoradores - 1] = cidadao;	
		
		//atualizacao do vetor de Moradores 
		moradores = temp;
		
		return temp[novaQtdeMoradores-1];
	}

		
}