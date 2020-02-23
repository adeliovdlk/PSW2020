package exercicio_7_2;

import java.util.Scanner;

public class Principal_Num_complexo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float parteReal;
		float parteImaginario;
		Numero_complexo aux = new Numero_complexo();
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("PRIMEIRO NUMERO COMPLEXO");
		System.out.println("INSIRA O VALOR DA PARTE REAL\n");
		parteReal= scanner.nextFloat();
		System.out.printf("primeiraparte real %f \n",parteReal);
		System.out.println("\n");
		
		System.out.println("INSIRA O VALOR DA PARTE IMAGINARIA\n");
		parteImaginario = scanner.nextFloat();
		System.out.println("\n");
		
		
		System.out.printf("primeiraparte imaginario %f\n",parteImaginario);
		Numero_complexo Numero_complexo1 = new Numero_complexo(parteReal, parteImaginario);
		
		System.out.println("INSIRA O SEGUNDO NUMERO COMPLEXO");

	    System.out.print("INSIRA O VALOR DA PARTE REAL\n: ");
	    parteReal = scanner.nextFloat();
	    System.out.printf("segunda parte real %f \n",parteReal);

	    System.out.print("INSIRA O VALOR DA PARTE IMAGINARIA\n: ");

	    parteImaginario = scanner.nextFloat();
	    System.out.printf("segunda parte imaginaria %f \n",parteImaginario);

	    Numero_complexo Numero_complexo2 = new Numero_complexo(parteReal, parteImaginario);

	    scanner.close();

	    Numero_complexo Numero_complexo3 = Numero_complexo1.adicao(Numero_complexo2);

	    Numero_complexo Numero_complexo4 = Numero_complexo1.subtracao(Numero_complexo2);
	    Numero_complexo Numero_complexo5 = Numero_complexo1.multiplicacao(Numero_complexo2);

	    Numero_complexo Numero_complexo6 = Numero_complexo1.divisao(Numero_complexo2);


	    System.out.println(Numero_complexo1 + " + " + Numero_complexo2 + " = " + Numero_complexo3);

	    System.out.println(Numero_complexo1 + " - " + Numero_complexo2 + " = " + Numero_complexo4);
	    System.out.println(Numero_complexo1 + " * " + Numero_complexo2 + " = " + Numero_complexo5);

	    System.out.println(Numero_complexo1 + " / " + Numero_complexo2 + " = " + Numero_complexo6);
		
		
		
	}

}
