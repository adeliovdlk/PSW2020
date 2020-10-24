package desenho;

import gui.JanelaAplicacao;

public class AplicacaoDesenho {

	private JanelaAplicacao janela;

	private static AplicacaoDesenho aplicacaoDesenho;

	private Documento doc;

	private AplicacaoDesenho() {
		doc = new Documento();
		janela = new JanelaAplicacao();
	}

	public static AplicacaoDesenho getAplicacao() {
		if(aplicacaoDesenho == null) {
			aplicacaoDesenho = new AplicacaoDesenho();
		}
		return aplicacaoDesenho;
	}

	public JanelaAplicacao getJanela() {
		return janela;
	}

	public Documento getDocumento() {
		return doc;
	}

	public static void main(String[] args) {
		AplicacaoDesenho.getAplicacao();
	}

}


