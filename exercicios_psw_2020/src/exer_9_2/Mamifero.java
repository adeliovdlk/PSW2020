package exer_9_2;

public class Mamifero extends Animal {
	private String alimento;
	
	
	

	public Mamifero(String nome, String cor, String ambiente, float comprimento, float velo_media, int numero_de_patas,
			String alimento) {
		super(nome, cor, ambiente, comprimento, velo_media, numero_de_patas);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	public void dadosMamifero(){
		System.out.println ( "NOME DA ESPECIE OU CLASSE - "+ nome +"\n COR = "+cor+", \n AMBIENTE ONDE VIVE ="
	    		 + ambiente +"\n COMPRIMENTO OU TAMANHO  = "+comprimento+"cm"+" \nTEM A VELOCIADE MEDIA IGUAL A "
				+velo_media+"m/s"+" \n SEU NUMERO DE PATAS E \t"+numero_de_patas+"\n SE ALIMENTA DE : "+alimento);
		
		
	}
	

}
