package manipulador;

import java.awt.Graphics;
import java.awt.event.MouseEvent;

import desenho.AplicacaoDesenho;
import modelo.Ponto;

public class ManipuladorPonto implements Manipulador {
	Ponto ponto;
	
	int estado;

	public ManipuladorPonto(Ponto p) {
		ponto = p;
		estado = 0;
	}

	@Override
	public void paint(Graphics g) {
		g.fillOval((int) ponto.getX() - 1, (int) ponto.getY() - 1, 3, 3);
	}

	@Override
	public void mouseClicked(int x, int y) {
		ponto.setX(x);
		ponto.setY(y);

		AplicacaoDesenho.getAplicacao().getJanela().setStatus("Ponto recebido na posição " + ponto);
	
		estado = 1;
	}

	
	@Override
	public void mouseDragged(int x, int y) {}

	@Override
	public void mouseMoved(int x, int y) {}

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
		if(estado == 1)
			return true;
		return false;
	}

}
