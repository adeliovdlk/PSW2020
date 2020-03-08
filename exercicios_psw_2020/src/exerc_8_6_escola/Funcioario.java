package exerc_8_6_escola;

import java.util.Date;

public class Funcioario {
	private int num_registro;
	private int salario;
	private String data_inic;
	public Funcioario() {
		super();
		this.num_registro = num_registro;
		this.salario = salario;
		this.data_inic = data_inic;
	}
	public int getNum_registro() {
		return num_registro;
	}
	public void setNum_registro(int num_registro) {
		this.num_registro = num_registro;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getData_inic() {
		return data_inic;
	}
	public void setData_inic(String string) {
		this.data_inic = string;
	}
	
	public String toString()
	{
	     return ("Funcionario numero de registro - "+ num_registro +" salario = "+salario+", data de inicio ="
	    		 + data_inic);
	}
	
	

}
