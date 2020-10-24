package desenho;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import modelo.Figura;
import modelo.Linha;

public class Documento {
	private List<Figura> listaFiguras;
	private Figura figuraAtual;
	
	
	public Documento() {
		listaFiguras = new LinkedList<Figura>();
		figuraAtual = null;
	}
	
	public Iterator<Figura> iteradorFiguras() {
		return listaFiguras.iterator();
	}
	
	public void adicionaFigura(Figura f) {
		if(f == null)
			return;
		listaFiguras.add(f);
	}
	
	public void desenharLinha() {
		figuraAtual = new Linha();
	}
	
}
