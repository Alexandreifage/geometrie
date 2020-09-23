package com.geometrie.etude.test;

import com.geometrie.etude.figure.Carre;
import com.geometrie.etude.figure.Cercle;
import com.geometrie.etude.figure.Figure;
import com.geometrie.etude.figure.Rectangle;
import com.geometrie.etude.figure.Triangle;

public final class TestFigure {

	public static void main(String[] args) {
		
		Figure f = new Triangle(23, 44);
		afficherSurface(f);	
		
		f = new Carre(10);

		afficherSurface(f);	
		
		Triangle t = new Triangle (25, 32);
		t.calculerSurface();
		
	
		Rectangle r = new Rectangle(11, 22);
		afficherSurface(r);
		
		double Aire = t.calculerSurface();
		System.out.println("La surface du triangle est de  " + Aire);
		
		Carre c = new Carre (25);
		c.calculerSurface();
		
		double Aire2 = c.calculerSurface();
		System.out.println("La surface du carré est de  " + Aire2);
		
		Cercle ce = new Cercle (25);
		ce.calculerSurface();
		
		double Aire3 = ce.calculerSurface();
		System.out.println("La surface du cercle est de  " + Aire3);
		
		
	}
	
	public static void afficherSurface(Figure figure) {
		
		if(figure instanceof Triangle) {
			double base = ((Triangle)figure).getBase();
			System.out.println("la base ti triangle est de: " + base);
		}
		System.out.println("surface " + figure.calculerSurface());
	}

}
