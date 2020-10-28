package exer15_5_desenho_circulo;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VetorCirculo extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private Painel mousePanel;
	private String message;
	private String origin;
	private int originX, originY;
	private int radiusX, radiusY;

	VetorCirculo(){
		super("Vetor de círculos");
		
		setSize(750, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		message = "";
		
		/* Mensagens de Rodapé */
		
		JLabel status = new JLabel("Mensagens de evento do mouse");
		add(status, BorderLayout.SOUTH);
		
		/* Painel de desenho */
		
		mousePanel = new Painel();
		mousePanel.createVetorCirculo();
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
				
			/*	if (message.length() > 1)
					moved = moved + " - " + message;*/
				
				status.setText(moved);
				
			}
			
		});
		
		
	
		setVisible(true);
	}
}





