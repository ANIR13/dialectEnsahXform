package com.bo;

import java.awt.Graphics2D;

public class Ligne extends Forme {
	public Ligne(){}
	public Ligne(int x,int y){super(x,y);}
	
	
	 @Override
	public void dessine(Graphics2D surface){surface.drawLine(x, y,0,0);}

	

}
