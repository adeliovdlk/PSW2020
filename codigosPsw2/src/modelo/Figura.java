package modelo;

import manipulador.Manipulador;



public interface Figura {
		Manipulador getManipulador();
		
		Figura clone();
}


