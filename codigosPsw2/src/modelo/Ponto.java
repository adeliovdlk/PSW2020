package modelo;

import manipulador.Manipulador;
import manipulador.ManipuladorPonto;

public class Ponto implements Figura {
	private float x;
	private float y;

	private ManipuladorPonto manipulador;

	public Ponto() {
		x = 0;
		y = 0;
	}
	
	public Ponto(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Ponto(Ponto p) {
		x = p.x;
		y = p.y;
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "; " + y + ")";
	}

	@Override
	public Ponto clone() {
		return new Ponto(x, y);
	}

	@Override
	public Manipulador getManipulador() {
		if(manipulador == null)
			manipulador = new ManipuladorPonto(this);
		return manipulador;
	}

	

}
