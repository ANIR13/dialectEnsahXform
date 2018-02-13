package com.bo;

import java.awt.Graphics2D;

public class Cercle extends Forme {
	//les attributes
	private int Rayon;
	//constrector
	public Cercle(){}
	public Cercle(int x,int y,int Rayon){
		
		
		super(x,y);
		this.Rayon=Rayon;
	}
	//getter and settter
	public int getRayon() {
		return Rayon;
	}
	public void setRayon(int rayon) {
		Rayon = rayon;
	}
	//la methode pour drow Cercle
	 @Override
	public void dessine(Graphics2D surface){surface.drawOval(x-Rayon, y-Rayon, 2*Rayon, 2*Rayon);}
}
