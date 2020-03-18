package exerc_10_4;

public class Principal_funcionario_10_4 {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("Adelio"," Castro", "Ti","marco de 2000", "7878787"," 04114455552", 5240);
		
		Funcionario func2 = new Funcionario ("Joao", "PEDRO", "EVENTOS", "marco de 2000", "7878787", "04114455552", 1000);
		
		System.out.print(func1.toString());
		System.out.printf("O FUNCIONARIO\t"+func1.getPrimeiroNome()+"\tTEM O GANHO ANUAL DE\t");
		System.out.print(func1.calculaGanhoAnual());
		
		/*System.out.print("\n"+func2.toString());
		System.out.printf("O FUNCIONARIO\t"+func2.getPrimeiroNome()+"\tTEM O GANHO ANUAL DE\t");
		System.out.print(func2.calculaGanhoAnual());*/
		func1.recebeAumento(20);
		System.out.print(func1.toString());
		System.out.printf("O FUNCIONARIO\t"+func1.getPrimeiroNome()+"\tTEM O GANHO ANUAL DE\t");
		System.out.print(func1.calculaGanhoAnual());
		

	}

}
