package exerc_7_4_Retangulo;

import java.util.Scanner;



public class Principal_Retangulo_7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x,y;
		Retangulo r1 = new Retangulo();
		Retangulo r2 = new Retangulo();
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Entre com o comprimento do ret�ngulo: ");
		x = leitura.nextFloat();
		System.out.println("Entre com a largura do ret�ngulo: ");
		y = leitura.nextFloat();
		r1.setComprimento(x);
		r1.setLargura(y);
		System.out.printf("O perimetro �: %f\n", r1.perimetroNum());
		System.out.printf("A �rea do ret�ngulo �: %f\n", r1.areaNum());
		
		System.out.println("Entre com o comprimento do ret�ngulo: ");
		x = leitura.nextFloat();
		System.out.println("Entre com a largura do ret�ngulo: ");
		y = leitura.nextFloat();
		r2.setComprimento(x);
		r2.setLargura(y);
		System.out.printf("O perimetro �: %f\n", r2.perimetroNum());
		System.out.printf("A �rea do ret�ngulo �: %f\n", r2.areaNum());

	}

}
