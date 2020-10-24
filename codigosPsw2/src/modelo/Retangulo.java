package modelo;

import manipulador.Manipulador;
import manipulador.ManipuladorRetangulo;

public class Retangulo implements Figura {
	private Ponto a;
	private Ponto b;
	
	private ManipuladorRetangulo manipulador;
	
	Retangulo() {
		a = new Ponto();
		b = new Ponto();
	}
	Retangulo(Ponto a, Ponto b) {
		this.a = a.clone();
		this.b = b.clone();
	}
	Retangulo(Retangulo r) {
		this.a = r.a.clone();
		this.b = r.b.clone();
	}
	@Override
	public Retangulo clone() {
		return new Retangulo(a, b);
	}
	@Override
	public String toString() {
		return "{" + a + b + "}";
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
			manipulador = new ManipuladorRetangulo(this);
		return manipulador;
	}

}

