package com.bo;

import java.awt.Graphics2D;

public class Caree extends Forme {

private int Largeur=100;
public Caree(){}
public Caree(int x,int y,int largeur) {
	super(x,y);
	this.Largeur = largeur;
}

public int getLargeur() {
	return Largeur;
}

public void setLargeur(int largeur) {
	Largeur = largeur;
}
//methode pour drow Caree
@Override
public void dessine(Graphics2D surface){
	
	
	surface.drawRect(x-Largeur/2, y-Largeur/2, Largeur, Largeur);}

}
