package exerc_7_5;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrilatero Quadri = new Quadrilatero(1,1, 1,5,3,7,5,3);
		System.out.println(Quadri);
		Trapezio Trapez = new Trapezio(2,2,5,2,1,5,6,5);
		System.out.println(Trapez);
		Paralelogramo parelo =new Paralelogramo(2,2,5,2,3,5,6,5);
		System.out.println(parelo);
		Retangulo retangulo =new Retangulo(2,2,5,2,3,5,6,5);
		System.out.println(retangulo);
		Quadrado quadrado = new Quadrado(2,2,5,2,3,5,6,5);
		System.out.println(quadrado);
		
	}

}
