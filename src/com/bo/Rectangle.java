package com.bo;

import java.awt.Graphics2D;

public class Rectangle  extends Forme{
	//attributes
	private int Largeur;
	private int Longueur;
	//const
	public Rectangle(){}
	public Rectangle(int x,int y,int Largeur,int Longueur){
		
		
		
		super(x,y);
		this.Largeur=Largeur;
		this.Longueur=Longueur;
	}
	//method to drow this Rect
	 @Override
	public void dessine(Graphics2D surface){surface.drawRect(x-Largeur, y-Longueur, Largeur, Longueur);}
	}

