package fr.bloome.masterbouzz;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelpWindow extends JFrame {
	public HelpWindow(){
		JLabel text = new JLabel();
		JButton bouton = new JButton("Lancer Le jeu");
		bouton.addActionListener(e -> {
			MainWindow mainWindow = new MainWindow();
			this.dispose();
		});
		text.setText("<html><h1>Aide de MasterBouzz</h1>"
				+ "<p>Le MasterBrain est un jeu de logique et de déduction."
				+ " Le but est de résoudre le code couleur généré par la machine."
				+ " Il suffit d'appuyer sur les boutons pour ajouter une couleur à la ligne."
				+ " Lorsque la ligne est pleine, le jeu vous dit combien de couleur sont bonnes. ");
		this.add(text);
		this.add(bouton, BorderLayout.SOUTH);
		this.setSize(300, 210);
		this.setResizable(false);
		this.setTitle("MasterBouzz - Aide");
		this.setVisible(true);
	}
}
