package modelo;


/*
import gui.Circulo;
import gui.Figura;
import gui.Manipulador;
import gui.ManipuladorCirculo;
import gui.Ponto;*/

import manipulador.Manipulador;
import manipulador.ManipuladorCirculo;

public class Circulo implements Figura {
	private Ponto centro;
	private float raio;
	
	private ManipuladorCirculo manipulador;
	
	public Circulo() {
		centro = new Ponto();
		raio = 0;
	}
	public Circulo(Ponto centro, float raio) {
		this.centro = centro.clone();
		this.raio = raio;
	}
	public Circulo(Circulo circulo) {
		this.centro = circulo.centro.clone();
		raio = circulo.raio;
	}
	@Override
	public Circulo clone() {
		return new Circulo(centro, raio);
	}
	@Override
	public String toString() {
		return "[" + centro + "; " + raio + "]";
	}
	
	public Ponto getCentro() {
		return centro.clone();
	}
	
	public void setCentro(Ponto centro) {
		this.centro = centro.clone();
	}
	
	public float getRaio() {
		return raio;
	}
	
	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	@Override
	public Manipulador getManipulador() {
		if(manipulador == null)
			manipulador = new ManipuladorCirculo(this);
		return manipulador;
	}

}