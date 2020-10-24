package manipulador;

import java.awt.Graphics;

import modelo.Retangulo;

public class ManipuladorRetangulo implements Manipulador {

	public ManipuladorRetangulo(Retangulo retangulo) {}

	@Override
	public void paint(Graphics g) {}

	@Override
	public void mouseDragged(int x, int y) {}

	@Override
	public void mouseMoved(int x, int y) {}

	@Override
	public void mouseClicked(int x, int y) {}

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
		return false;
	}

}
