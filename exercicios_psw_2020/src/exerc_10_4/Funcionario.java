package exerc_10_4;

public class Funcionario {
	private String primeiroNome;
	private String sobrenome;
	private String departOndeTrabalha;
	private String dataDeEntradaNaEmpresa;
	private String RG;
	private String CPF;
	private float salario;
	public Funcionario(String primeiroNome, String sobrenome, String departOndeTrabalha, String dataDeEntradaNaEmpresa,
			String rG, String cPF, float salario) {
		super();
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.departOndeTrabalha = departOndeTrabalha;
		this.dataDeEntradaNaEmpresa = dataDeEntradaNaEmpresa;
		RG = rG;
		CPF = cPF;
		this.salario = salario;
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getDepartOndeTrabalha() {
		return departOndeTrabalha;
	}
	public void setDepartOndeTrabalha(String departOndeTrabalha) {
		this.departOndeTrabalha = departOndeTrabalha;
	}
	public String getDataDeEntradaNaEmpresa() {
		return dataDeEntradaNaEmpresa;
	}
	public void setDataDeEntradaNaEmpresa(String dataDeEntradaNaEmpresa) {
		this.dataDeEntradaNaEmpresa = dataDeEntradaNaEmpresa;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float d) {
		this.salario = d;
		
	}
	public void verificaNegativo(){
		if (getSalario()<=0)
			setSalario((float) 0.0);;
	}
	public float recebeAumento(int x){
		x=x/100;
		float a=0;
		return a; //=((getSalario())+= (getSalario())*x));
		//setSalario(a);
	
	}
	public float calculaGanhoAnual(){
		float aux;
		return aux= getSalario()*13;
		
	}
	@Override
	public String toString()
	{
	     return ("O NOME É "+ primeiroNome+"\t O SOBRE NOME É  "+sobrenome+ "\n O DEPARTAMENTO ONDE TRABALHA É O   - "+ departOndeTrabalha
	    		 +"\n ENTROU NA EMPRESA EM  = "+dataDeEntradaNaEmpresa+"\n POSSUI O RG :"+RG+
	    		 "\n ESTA INSCRITO NO CPF  :"+CPF+"\nPOSSUI O SALARIO DE : "+salario);
	
	}
	
	
	
	
	
	
	
	
	

}
