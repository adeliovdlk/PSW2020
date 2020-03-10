package exer_9_2;

import java.util.Scanner;

public class Principal_exer_9_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	//Animal animal = new Animal(nome, cor, ambiente, comprimento, velo_media, numero_de_patas)
	Mamifero mamifero = new Mamifero("CAMELO", "AMARELO", "TERRA",150,(float) 2.0,4, "CACTO");
	Peixe tubarao = new Peixe("TUBARAO ", "CIZENTO","MAR", 300, (float) 1.5 ,0,"BARBATANA E CAUDA");
	Mamifero ursocanada = new Mamifero("URSO-DO-CANADA","VERMELHO", "TERRA", 180,(float) 0.5,4,"MEL");
	//mamifero.dadosMamifero();
	//tubarao.dadosPeixe();
	System.out.println("DIGITE A CLASSE DE ANIMAL QUE QUER CONSUTAR : "+
	"CAMELO OU TUBARAO OU URSO ");
	String aux = sc.next();
	
	if (aux == "CAMELO")
		mamifero.dadosMamifero();
	else if (aux == "TUBARAO")
		tubarao.dadosPeixe();
	else
		ursocanada.dadosMamifero();
		
	
	
	}
}
