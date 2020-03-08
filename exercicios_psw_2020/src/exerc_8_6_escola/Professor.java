package exerc_8_6_escola;

public class Professor extends Pessoa{
	private String disciplina;
	
	
	public Professor(){
		this.disciplina=disciplina;
		this.nome=nome;
	}


	public String getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String toString()
	{
	     return ("PROFESSOR  "+nome+"\t A  DISCIPLINA E - "+ disciplina);
	}
	
}
