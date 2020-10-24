package modelo;

import manipulador.ManipuladorLinha;
import manipulador.Manipulador;


public class Linha implements Figura {
	private Ponto a;
	private Ponto b;
	
	private ManipuladorLinha manipulador;
	
	public Linha() {
		a = new Ponto();
		b = new Ponto();
	}
	
	public Linha(Ponto a, Ponto b) {
		this.a = a.clone();
		this.b = b.clone();
	}
	
	public Linha(Linha l) {
		a = new Ponto(l.a);
		b = new Ponto(l.b);
	}
	
	@Override
	public String toString() {
		return "[" + a + b + "]";
	}
	
	@Override
	public Linha clone() {
		return new Linha(a, b);
	}

	public Ponto getA() {
		return a.clone();
	}

	public void setA(Ponto a) {
		this.a = a.clone();
	}

	public Ponto getB() {
		return b.clone();
	}

	public void setB(Ponto b) {
		this.b = b.clone();
	}

	@Override
	public Manipulador getManipulador() {
		if(manipulador == null)
			manipulador = new ManipuladorLinha(this);
		return manipulador;
	}
}

