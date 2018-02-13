package com.bo;

import java.awt.Graphics2D;

public abstract  class Forme {
	// les attributes
	protected int x;
	protected int y;
	//constrector
	public Forme(){}
	public Forme(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	 public abstract void dessine(Graphics2D surface);
	

}
