package gui;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import modelo.Figura;
import modelo.Linha;
import modelo.Ponto;

public class JanelaAplicacao extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PainelDesenho painelDesenho;
	private JLabel status;

	public JanelaAplicacao() {
		super("Desenhos");

		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		mnArquivo.add(mntmAbrir);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		mnArquivo.add(mntmSalvar);
		
		JMenu mnFormas = new JMenu("Formas");
		menuBar.add(mnFormas);
		
		JMenuItem mntmPonto = new JMenuItem("Ponto");
		mntmPonto.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Figura f = new Ponto();
				painelDesenho.desenharFigura(f);
				setStatus("Desenhando ponto.");
			}
		});
		mnFormas.add(mntmPonto);
		
		JMenuItem mntmLinha = new JMenuItem("Linha");
		mntmLinha.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Figura f = new Linha();
				painelDesenho.desenharFigura(f);
				setStatus("Desenhando linha.");
			}
		});
		mnFormas.add(mntmLinha);
		
		JMenuItem mntmCirculo = new JMenuItem("Circulo");
		mntmCirculo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		mnFormas.add(mntmCirculo);
		
		JMenuItem mntmRetangulo = new JMenuItem("Retangulo");
		mntmRetangulo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		mnFormas.add(mntmRetangulo);
		
		getContentPane().setLayout(new BorderLayout(2, 2));
		
		status = new JLabel("Aplicação de desenho!");
		getContentPane().add(status, BorderLayout.SOUTH);
		
		painelDesenho = new PainelDesenho();
		
		getContentPane().add(painelDesenho, BorderLayout.CENTER);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1920, 1080); // ideal é calcular de acordo com o tamanho do display
		this.setVisible(true);
	}
	
	public void setStatus(String str) {
		status.setText(str);
	}
}
