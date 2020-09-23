package com.geometrie.etude.figure;

public class Triangle extends Polygone {
	private static final int NBR_COTES = 2;
	
	
	private double hauteur;
	private double base;
	
	//constructeur:
	public Triangle(double base, double hauteur) {
		super(NBR_COTES);
		this.hauteur = hauteur;
		this.base = base;
		
	}
	
	// methode
	@Override
	public double calculerSurface() {
		return base * hauteur / 2;
	}
	
	
	// getters and setters
	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	

}
