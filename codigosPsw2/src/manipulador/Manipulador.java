package manipulador;

import java.awt.Graphics;

public interface Manipulador {
	void paint(Graphics g);
	void mouseDragged(int x, int y);
	void mouseMoved(int x, int y);
	void mouseClicked(int x, int y);
	void mouseEntered(int x, int y);
	void mouseExited(int x, int y);
	void mousePressed(int x, int y);
	void mouseReleased(int x, int y);
	
	// falso - Figura não finalizada
	// true - figura finalizada
	boolean estaFinalizada();
}