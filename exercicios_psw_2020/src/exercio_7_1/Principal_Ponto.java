package exercio_7_1;

import java.util.Scanner;

public class Principal_Ponto {
	public static void main( String[] args){
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto ();
		Scanner sc= new Scanner(System.in);
		System.out.println(" ENTRE COM O VALOR DO PONTO 1 para x e y  \n");
		p1.x=sc.nextFloat();
		p1.y=sc.nextFloat();
		System.out.println(" ENTRE COM O VALOR DO PONTO  para x e y  \n");
		p2.x=sc.nextFloat();
		p2.y=sc.nextFloat();
		
		
		
		System.out.printf("O PONTO 1 TEM CORDENADAA X %f , Y %f \n",p1);
		System.out.printf("O PONTO 1 TEM CORDENADAA X %f , Y %f \n",p2);
		System.out.printf("a distancia entre o ponto 1 de o ponto 2 e: %f ",p1.distancia(p2));
		//verificar se os pontos sao iguais
		if(p1==p2)
		System.out.println("p1 e p2 sao "+
				  "iguais");
		else
		System.out.println("p1 e p2 sao " + 
				(p1.equals(p2) ? "iguais" : "diferentes"));
	System.out.println(p1.toString());

}
}
