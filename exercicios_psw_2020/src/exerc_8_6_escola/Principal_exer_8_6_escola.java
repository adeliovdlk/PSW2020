package exerc_8_6_escola;

import java.util.Scanner;

public class Principal_exer_8_6_escola {

	public static void main(String[] args) {
		//Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Funcioario peao = new Funcioario();
		Servente servent = new Servente();
		Professor prof = new Professor();
		Diretor diretor = new Diretor();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		aluno.setNome(sc.next());
		
		
		System.out.println("Digite um curso: ");
		aluno.setCurso(sc.next());
		
		System.out.println("Digite a serie : ");
		aluno.setSerie(sc.next());
		
		
		System.out.println("Digite o numero de registro: ");
		peao.setNum_registro(sc.nextInt());
		
		System.out.println("Digite um salario: ");
		peao.setSalario(sc.nextInt());
		
		System.out.println("Digite uma data: ");
		peao.setData_inic(sc.next());
		
		
		System.out.println("Digite o setor: ");
		servent.setSetor(sc.next());
		
		System.out.println("Digite o nome do professor: ");
		prof.setNome(sc.next());
		System.out.println("Digite a disciplina: ");
		prof.setDisciplina(sc.next());
		
		
		System.out.println("Digite o ano de mandato: ");
		diretor.setAno_Mandato(sc.next());
		System.out.printf(/*pessoa.toString()+"\n"+*/aluno.toString()+"\n"+peao.toString()+"\n"+
				servent.toString()+"\n"+prof.toString()+"\n"+diretor.toString());
	}

}
