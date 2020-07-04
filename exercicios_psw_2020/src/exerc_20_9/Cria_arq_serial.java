package exerc_20_9;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import exer_7_3.Ponto_2D;

public class Cria_arq_serial {

	Ponto_2D ponto = new Ponto_2D();
	private ObjectOutputStream out;
	
	public void open() {
		try {
			out = new ObjectOutputStream(new FileOutputStream("c:\\Users\\adeli\\Desktop\\texto\\retangulo_serial.txt"));
		}
		catch(IOException e) {
			
			e.printStackTrace();
			System.exit(0);
		}
	}

	public void adicionaRegistro() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Para terminar, digite <ctrl> d no UNIX/Linux/Mac OS X\n" + 
						"ou <ctrl> Z no Windows.\n\n");
		
		System.out.println("Informe coordenadas do ponto:");
		
		while(sc.hasNext()) {							
			ponto.setY(sc.nextDouble());
			ponto.setY(sc.nextDouble());
			
			System.out.println("Pressione ctrl + z \n");
			if(ponto.getX() > -1 || ponto.getY() > -1) {
				try {
					out.writeObject(ponto);			
				} catch (IOException e) {
					e.printStackTrace();			//sequencia de chamadas até onde encontrou o erro (primeiro passo para debugar)
					System.exit(0);
				}
			} else {
				System.out.println("O numero deve ser igual ou maior que 0.");
			}
		}
		//out.writeObject(politico);
	}
	
	public void closeFile() {
		if(out != null) {
			try {
				out.close();
				out = null;
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	}

public class Cria_arq_Serial {

}
