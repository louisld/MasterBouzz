package fr.bloome.masterbouzz;

import java.awt.Color;

public enum Colors {
	RED(Color.RED, "rouge"),
	BLUE(Color.BLUE, "bleu"),
	YELLOW(Color.YELLOW, "jaune"),
	GREEN(Color.GREEN, "vert");
	
	public final Color couleur;
	public final String name;
	
	Colors(Color couleur, String name){
		this.couleur = couleur;
		this.name= name;
	}
	
	public String toString(){
		return this.name();
	}
	
}
