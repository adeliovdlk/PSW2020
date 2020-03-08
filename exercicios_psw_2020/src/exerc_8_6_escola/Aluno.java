package exerc_8_6_escola;

public class Aluno  extends Pessoa{
	private String curso;
	private String serie;

	public Aluno (){
		this.curso= curso;
		this.serie= serie;
		this.nome= nome;
	}

	

	public String getCurso() {
		return curso;
	}

	public void setCurso(String string) {
		this.curso = string;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String string) {
		this.serie = string;
	}
	public String toString()
	{
	     return ("nome e "+nome+ "\t curso  - "+ curso +" esta na serie = "+serie);
	
	}
}
