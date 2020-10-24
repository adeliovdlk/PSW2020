package gui;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

import desenho.AplicacaoDesenho;
import desenho.Documento;
import modelo.Figura;
import modelo.Linha;
import modelo.Ponto;

public class PainelDesenho extends JPanel 
	implements MouseMotionListener, MouseListener 
{
	private static final long serialVersionUID = 1L;

	private Figura figuraAtual;
	
	public PainelDesenho() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Documento doc = AplicacaoDesenho.getAplicacao().getDocumento();
		Iterator<Figura> iterador = doc.iteradorFiguras();
		
		while(iterador.hasNext()) {
			iterador.next().getManipulador().paint(g);
		}
		
		if(figuraAtual != null) {
			figuraAtual.getManipulador().paint(g);
		}
	}

	public void desenharFigura(Figura f) {
		figuraAtual = f;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if(figuraAtual != null) {
			figuraAtual.getManipulador().mouseDragged(e.getX(), e.getY());
			repaint();
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if(figuraAtual != null) {
			figuraAtual.getManipulador().mouseMoved(e.getX(), e.getY());
			repaint();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(figuraAtual != null) {
			figuraAtual.getManipulador().mouseClicked(e.getX(), e.getY());
			
			if(figuraAtual.getManipulador().estaFinalizada()) { // terminou de desenhar a figura
				AplicacaoDesenho.getAplicacao().getDocumento().adicionaFigura(figuraAtual);
				
				figuraAtual = figuraAtual.clone();
			}
			
			repaint();
		} 
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(figuraAtual != null) {
			figuraAtual.getManipulador().mouseEntered(e.getX(), e.getY());
			repaint();
		} 
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(figuraAtual != null) {
			figuraAtual.getManipulador().mouseExited(e.getX(), e.getY());
			repaint();
		} 
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(figuraAtual != null) {
			figuraAtual.getManipulador().mousePressed(e.getX(), e.getY());
			repaint();
		} 
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(figuraAtual != null) {
			figuraAtual.getManipulador().mouseReleased(e.getX(), e.getY());
			repaint();
		} 
	}
}

