package exercicio_7_2;

public class Numero_complexo {
	public float parteReal;
	public float parteImaginaria;
	public Numero_complexo() {
		this.parteReal = 0;
		this.parteImaginaria = 0;
		
	}
	
	public Numero_complexo(float a , float b) {
		this.parteReal = a;
		this.parteImaginaria = b;
	}

	public double getParteReal() {
		return parteReal;
		
	}

	public void setParteReal(float parteReal) {
		this.parteReal = parteReal;
	}

	public float getParteImaginaria() {
		return parteImaginaria;
	}

	public void setParteImaginaria(float parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}
	
	public Numero_complexo adicao(Numero_complexo aux){
		float real,imaginario;
		real=parteReal+ aux.parteReal;
		imaginario= parteImaginaria+ aux.parteImaginaria;
		return new Numero_complexo(real,imaginario);			
	}
	
	public Numero_complexo subtracao(Numero_complexo outro){
		float real,imaginario;
		real=parteReal - outro.parteReal;
		imaginario= parteImaginaria - outro.parteImaginaria;
		return new Numero_complexo(real,imaginario);			
	}
	@Override
	public String toString() {
		return String.format("numero real : imaginario  (%.2f, %.2f)", getParteReal(),getParteImaginaria());
	}
	

}
