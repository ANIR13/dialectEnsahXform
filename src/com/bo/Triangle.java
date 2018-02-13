package com.bo;

import java.awt.Graphics2D;

public class Triangle extends Forme {
	//les attributes
	private int Base;
	private int[] cote1= new int[3];
	private int[] cote2= new int[3];
	//constrector
	public Triangle(){}

	public Triangle(int base, int[] cote1, int[] cote2) {
		Base = base;
		this.cote1 = cote1;
		this.cote2 = cote2;
	}

	//methode pour drow le Triangle
	 @Override
	public void dessine(Graphics2D surface){surface.drawPolygon(cote2, cote1, Base);}
}
