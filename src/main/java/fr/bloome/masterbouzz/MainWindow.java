package fr.bloome.masterbouzz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class MainWindow extends JFrame {

	private int position = 0;
	private int line = 1;
	private Colors[] buffer = new Colors[5];
	private JPanel panel1 = new JPanel();
	private JScrollPane scroll = new JScrollPane();

	MainWindow() {
		this.setTitle("Masterbouzz");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 350);
		this.setResizable(false);
		GridLayout l = new GridLayout(0, 5);
		l.setHgap(0);
		l.setVgap(0);
		this.getContentPane().setLayout(new BorderLayout());
		panel1.setLayout(l);
		JPanel panel2 = new JPanel();
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setViewportView(panel1);
		this.getContentPane().add(scroll, BorderLayout.CENTER);
		this.getContentPane().add(panel2, BorderLayout.SOUTH);
		JButton bleu = new JButton("Bleu");
		bleu.addActionListener(e -> {
			update(Colors.BLUE);
		});
		JButton rouge = new JButton("Rouge");
		rouge.addActionListener(e -> {
			update(Colors.RED);
		});
		JButton jaune = new JButton("Jaune");
		jaune.addActionListener(e -> {
			update(Colors.YELLOW);
		});
		JButton vert = new JButton("Vert");
		vert.addActionListener(e -> {
			update(Colors.GREEN);
		});
		panel2.setLayout(new GridLayout(0, 4));
		panel2.add(bleu);
		panel2.add(rouge);
		panel2.add(jaune);
		panel2.add(vert);
		this.setVisible(true);
	}

	/**
	 * Méthode créatrice de Chocapic
	 */
	public void update(Colors button) {
		switch (button) {
		case BLUE:
			panel1.add(new DesSeins(button.couleur));
			break;
		case GREEN:
			panel1.add(new DesSeins(button.couleur));
			break;
		case RED:
			panel1.add(new DesSeins(button.couleur));
			break;
		case YELLOW:
			panel1.add(new DesSeins(button.couleur));
			break;
		}
		panel1.revalidate();
		panel1.repaint();
		position++;
		//On ajoute une ligne et on scroll
		if(position%5 == 1 && position != 1){
			line++;
			scroll.getViewport().setViewPosition(new Point(0, line * 80));
			position = 1;
			Arrays.fill(buffer, null);
		}
		buffer[position - 1] = button;
		//On vérifie la ligne
		if(position%5 == 0){
			int valide = 0;
			for(int i =0;i<5;i++){
				if(buffer[i].toString() == Main.colorsRandom[i].toString()){
					valide++;
				}
			}
			if(valide == 5){
				JOptionPane.showMessageDialog(null, "La combinaison gagnante était " + Main.couleursGagnantes(),"Vous avez gagné !!! \\o/", JOptionPane.INFORMATION_MESSAGE);
			}
			else{
				JOptionPane.showMessageDialog(null, "Vous avez " + valide + " couleurs bonnes", "Raté", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
