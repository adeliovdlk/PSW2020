package exer_9_2;

public class Peixe extends Animal{
	private String caracteristica;

	


	public Peixe(String nome, String cor, String ambiente, float comprimento, float velo_media, int numero_de_patas,
			String caracteristica) {
		super(nome, cor, ambiente, comprimento, velo_media, numero_de_patas);
		this.caracteristica = caracteristica;
	}


	public String getCaracteristica() {
		return caracteristica;
	}


	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	public void dadosPeixe(){
		System.out.println ( "NOME DA ESPECIE OU CLASSE - "+ nome +"\n COR = "+cor+", \n AMBIENTE ONDE VIVE = "
	    		 + ambiente +"\nCOMPRIMENTO OU TAMANHO = "+comprimento+"  CENTIMETROS"+"\nTEM A VELOCIADE MEDIA IGUAL A "
				+velo_media+"m/s"+"\n SEU NUMERO DE PATAS E \t"+numero_de_patas+"\n POSSUI AS SEGUINTES CARACTERISTICAS "+caracteristica);
	
	}
}
