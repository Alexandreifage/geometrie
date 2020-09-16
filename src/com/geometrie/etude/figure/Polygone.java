package com.geometrie.etude.figure;

public abstract class Polygone extends Figure{
	
	private int nbrCotes;
	
	public Polygone( int nbrCotes ) {
		this.nbrCotes = nbrCotes;
	}
	
	public int getNbrCotes() {
		return nbrCotes;
	}

}
