package exerc_15_5;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



	
	public class Desenho_Circulo extends JFrame {

		private static final long serialVersionUID = 1L;
		
		private Painel mousePanel;
		private String message;
		private String origin;
		private int originX, originY;
		private int radiusX, radiusY;

		Desenho_Circulo(){
			super("Desenho Circulo");
			
			setSize(750, 750);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			setLayout(new BorderLayout());
			
			message = "";
			
						
			JLabel status = new JLabel("Mensagens de evento do mouse");
			add(status, BorderLayout.SOUTH);
			
			
			mousePanel = new Painel();
			mousePanel.createDesenho_Circulo();
			add(mousePanel, BorderLayout.CENTER);
			
			mousePanel.addMouseListener(new MouseListener(){

				@Override
				public void mouseClicked(MouseEvent arg0) {
					
					
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
					
					
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					
					
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
					originX = arg0.getX();
					originY = arg0.getY();
					
					origin = String.format("Origem: [%d; %d]", originX, originY);				
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
					mousePanel.repaint();

				}
				
			});
			
			mousePanel.addMouseMotionListener(new MouseMotionListener(){

				@Override
				public void mouseDragged(MouseEvent arg0) {
					radiusX = arg0.getX();
					radiusY = arg0.getY();
					
					message = origin + " - " + String.format("Raio: [%d; %d]", radiusX, radiusY);
					
					status.setText(message);
					
					mousePanel.setCirculo(originX, originY, radiusX, radiusY);
									
				}

				@Override
				public void mouseMoved(MouseEvent arg0) {
					String moved = String.format("Mouse na posição [%d; %d]", arg0.getX(), arg0.getY()) +
							" - " + String.format("Círculos: %d", mousePanel.getPosCirculo());
					
					status.setText(moved);
					
				}
				
			});
			
			
		
			setVisible(true);
		}
	}


	class Painel extends JPanel {
		private static final long serialVersionUID = 1L;
		
		private Circulo[] Desenho_Circulo;
		private int posCirculo = 0;
			
		public int getPosCirculo() {
			return posCirculo;
		}

		public void setPosCirculo(int posCirculo) {
			this.posCirculo = posCirculo;
		}
		
		public void createDesenho_Circulo() {
			Desenho_Circulo = new Circulo[500];
		}

		public void setCirculo(int originX, int originY, int radiusX, int radiusY){		
			if (Desenho_Circulo[posCirculo] == null)
				Desenho_Circulo[posCirculo] = new Circulo();
			
			Desenho_Circulo[posCirculo].setOriginX(originX);
			Desenho_Circulo[posCirculo].setOriginY(originY);
			Desenho_Circulo[posCirculo].setRadiusX(radiusX);
			Desenho_Circulo[posCirculo].setRadiusY(radiusY);
			
			Desenho_Circulo[posCirculo].calcRadius();		
		}
		
		public void paintComponent(Graphics g){
			
			int x, y;		
			
			for (int i = 0; i < Desenho_Circulo.length; i++) {
				x = Desenho_Circulo[posCirculo].getOriginX() - Desenho_Circulo[posCirculo].getRadius();
				y = Desenho_Circulo[posCirculo].getOriginY() - Desenho_Circulo[posCirculo].getRadius();
			
				g.drawOval(x, y, Desenho_Circulo[posCirculo].getRadius()*2, Desenho_Circulo[posCirculo].getRadius()*2);
			}
			
			posCirculo++;
			
		}
	}

	class Circulo {
		private int originX, originY;
		private int radiusX, radiusY;
		private int radius;
		
		public int getRadius() {
			return radius;
		}


		public void setRadius(int radius) {
			this.radius = radius;
		}


		public int getOriginX() {
			return originX;
		}
		
		
		public void setOriginX(int originX) {
			this.originX = originX;
		}
		
		public int getOriginY() {
			return originY;
		}
		
		public void setOriginY(int originY) {
			this.originY = originY;
		}
		
		public int getRadiusX() {
			return radiusX;
		}
		
		public void setRadiusX(int radiusX) {
			this.radiusX = radiusX;
		}
		
		public int getRadiusY() {
			return radiusY;
		}
		
		public void setRadiusY(int radiusY) {
			this.radiusY = radiusY;
		}
		
		public void calcRadius() {
			int x = Math.abs(originX - radiusX);
			int y = Math.abs(originY - radiusY);
			
			radius = (int) Math.abs(Math.sqrt((x*x) + (y*y)));
		}
		
		Circulo(){
			this.originX = 0;
			this.originY = 0;
			this.radiusX = 0;
			this.radiusY = 0;
		}
		

}
