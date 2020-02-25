package exerc_7_4_Retangulo;

import java.util.Scanner;



public class Principal_Retangulo_7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x,y;
		Retangulo r1 = new Retangulo();
		Retangulo r2 = new Retangulo();
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Entre com o comprimento do retângulo: ");
		x = leitura.nextFloat();
		System.out.println("Entre com a largura do retângulo: ");
		y = leitura.nextFloat();
		r1.setComprimento(x);
		r1.setLargura(y);
		System.out.printf("O perimetro é: %f\n", r1.perimetroNum());
		System.out.printf("A área do retângulo é: %f\n", r1.areaNum());
		
		System.out.println("Entre com o comprimento do retângulo: ");
		x = leitura.nextFloat();
		System.out.println("Entre com a largura do retângulo: ");
		y = leitura.nextFloat();
		r2.setComprimento(x);
		r2.setLargura(y);
		System.out.printf("O perimetro é: %f\n", r2.perimetroNum());
		System.out.printf("A área do retângulo é: %f\n", r2.areaNum());

	}

}
