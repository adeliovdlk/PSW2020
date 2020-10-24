package manipulador;

import java.awt.Graphics;

import modelo.Linha;
import modelo.Ponto;

public class ManipuladorLinha implements Manipulador {
	Linha linha;
	int estadoLinha;

	public ManipuladorLinha(Linha l) {
		linha = l;
		estadoLinha = 0;
	}

	@Override
	public void paint(Graphics g) {
		g.drawLine((int) linha.getA().getX(), (int) linha.getA().getY(), (int) linha.getB().getX(),
				(int) linha.getB().getY());
	}

	@Override
	public void mouseDragged(int x, int y) {}

	@Override
	public void mouseMoved(int x, int y) {
		switch (estadoLinha) {
		case 0: // linha ainda não existe
			break;
		case 1: // linha já tem um ponto definido
			Ponto b = new Ponto(x, y);
			linha.setB(b);
			break;
		case 2: // linha já está pronta
			break;
		}
	}

	@Override
	public void mouseClicked(int x, int y) {
		Ponto p = new Ponto(x, y);
		switch(estadoLinha) {
		case 0: // linha ainda não existe
			linha.setA(p);
			linha.setB(p);
			estadoLinha++; // linha com um ponto definido
			break;
		case 1: // linha já tem um ponto definido
			linha.setB(p);
			estadoLinha++; // vai para estado de linha pronta
			break;
		case 2: // linha já está pronta
			linha.setA(p);
			linha.setB(p);
			estadoLinha = 1; // linha com um ponto definido
			break;
		}	
	}

	@Override
	public void mouseEntered(int x, int y) {}

	@Override
	public void mouseExited(int x, int y) {}

	@Override
	public void mousePressed(int x, int y) {}

	@Override
	public void mouseReleased(int x, int y) {}

	@Override
	public boolean estaFinalizada() {
		if(estadoLinha == 2)
			return true;
		return false;
	}

}

