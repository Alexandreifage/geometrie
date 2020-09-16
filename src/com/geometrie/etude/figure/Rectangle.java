package com.geometrie.etude.figure;

public class Rectangle extends Polygone {
	
	// NBR_COTES en majuscules pour indiquer que c'est une constante
	// et "final" parce que tous les rectangles auront toujours 4 côtés, la variable est fixe !
	private static final int NBR_COTES = 4;
	
	
	
	private double hauteur ;
	private double base ;
	
	// constructeur:
		public Rectangle(double base, double hauteur) {
			super(NBR_COTES);
		this.hauteur = hauteur ;
		this.base = base ;
		
		}
		
	// méthode:
		@Override // vérifie que la methode est existante
		public double calculerSurface() {
			
			return hauteur * base ;
		}
		
		// getters and setters
		public double getBase() {
			return base;
		}
		public double getHauteur() {
			return hauteur;
		}

}
