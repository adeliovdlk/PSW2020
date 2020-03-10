package exer_9_2;

public class Animal {
	public String nome;
	public String cor;
	public String ambiente;
	public float comprimento;
	public float velo_media;
	public int numero_de_patas;

	
	public Animal(String nome, String cor, String ambiente, float comprimento,
			float velo_media, int numero_de_patas) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.velo_media = velo_media;
		this.numero_de_patas = numero_de_patas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public float getVelo_media() {
		return velo_media;
	}
	public void setVelo_media(float velo_media) {
		this.velo_media = velo_media;
	}
	public int getNumero_de_patas() {
		return numero_de_patas;
	}
	public void setNumero_de_patas(int numero_de_patas) {
		this.numero_de_patas = numero_de_patas;
	}
	public void dados(){
		System.out.println ( "NOME DA ESPECIE OU CLASSE - "+ nome +"\n COR = "+cor+", \n AMBIENTE ONDE VIVE ="
	    		 + ambiente +"\nCOMPRIMENTO OU TAMANHO"+comprimento+"\nTEM A VELOCIADE MEDIA IGUAL A "
				+velo_media+"\n SEU NUMERO DE PATAS E \t"+numero_de_patas);
		
		
	}
	

}
