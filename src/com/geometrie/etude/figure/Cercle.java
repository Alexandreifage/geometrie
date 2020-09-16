package com.geometrie.etude.figure;

public class Cercle extends Figure {
	
	private double rayon ;
	
	// constructeur:
	public Cercle(double rayon) {
	this.rayon = rayon ;
	}
	
	// méthode:
	@Override // vérifie que la methode est existante
	public double calculerSurface() {
		
		return rayon * rayon * Math.PI;
	}

}
