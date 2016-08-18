package fr.bloome.masterbouzz;

import java.util.Random;

public class Main {
	
	public static Colors[] colorsRandom = new Colors[5];

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			colorsRandom[i] = Colors.values()[new Random().nextInt(Colors.values().length)];
		}
		for(int i1=0;i1<5;i1++){
			System.out.println(colorsRandom[i1].toString());
		}
		HelpWindow helpWindow = new HelpWindow();
	}
	
	public static String couleursGagnantes(){
		String retour = new String();
		for(int i1=0;i1<5;i1++){
			retour += colorsRandom[i1].toString() + ", ";
		}
		return retour;
	}

}
