package exerc_8_6_escola;

public class Pessoa {
	String nome;
	public Pessoa(){
		
	}
	public Pessoa(String a){
		this.nome=a;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String toString()
	{
	     return ("o nome e  - "+ nome );
	}
	
}
	