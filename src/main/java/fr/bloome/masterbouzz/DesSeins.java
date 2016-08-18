package fr.bloome.masterbouzz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DesSeins extends JPanel {
	
	public Color couleur;
	
	public DesSeins(Color couleur){
		this.couleur = couleur;
		this.setSize(new Dimension(80,80));
		this.setPreferredSize(new Dimension(80,80));
		this.setMinimumSize(new Dimension(80,80));
		this.setMaximumSize(new Dimension(80,80));
	}
	public void paintComponent(Graphics g){
		g.setColor(couleur);
	    g.fillRect(0, 0, 80, 80);
	    g.setColor(Color.BLACK);
	    g.fillRect(0, 0, 3, 80);
	    g.fillRect(78, 0, 3, 80);
	    g.fillRect(0, 0, 80, 3);
	    g.fillRect(0, 78, 80, 3);
	  }
}
