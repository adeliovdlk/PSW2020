package exer15_5_desenho_circulo;

import java.awt.Graphics;

import javax.swing.JPanel;


public class Painel extends JPanel {
		private static final long serialVersionUID = 1L;
		
		private Circulo[] vetorCirculo;
		private int posCirculo = 0;
			
		public int getPosCirculo() {
			return posCirculo;
		}

		public void setPosCirculo(int posCirculo) {
			this.posCirculo = posCirculo;
		}
		
		public void createVetorCirculo() {
			vetorCirculo = new Circulo[500];
		}

		public void setCirculo(int originX, int originY, int radiusX, int radiusY){		
			if (vetorCirculo[posCirculo] == null)
				vetorCirculo[posCirculo] = new Circulo();
			
			vetorCirculo[posCirculo].setOriginX(originX);
			vetorCirculo[posCirculo].setOriginY(originY);
			vetorCirculo[posCirculo].setRadiusX(radiusX);
			vetorCirculo[posCirculo].setRadiusY(radiusY);
			
			vetorCirculo[posCirculo].calcRadius();		
		}
		
		public void paintComponent(Graphics g){
			
			int x, y;		
			
			for (int i = 0; i < vetorCirculo.length; i++) {
				x = vetorCirculo[posCirculo].getOriginX() - vetorCirculo[posCirculo].getRadius();
				y = vetorCirculo[posCirculo].getOriginY() - vetorCirculo[posCirculo].getRadius();
			
				g.drawOval(x, y, vetorCirculo[posCirculo].getRadius()*2, vetorCirculo[posCirculo].getRadius()*2);
			}
			
			posCirculo++;
			
		}
}




