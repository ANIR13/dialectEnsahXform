package com.bo;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.xml.bind.annotation.*;
//Root:la racine du document et de ses sous-éléments
@XmlRootElement
public class Formes {
	
	
	
	
	@XmlElements({
	@XmlElement(name="Caree",type=Caree.class),
	@XmlElement(name="Triangle",type=Triangle.class),
	@XmlElement(name="Ligne",type=Ligne.class),
	@XmlElement(name="Rectangle",type=Rectangle.class),
	@XmlElement(name="Cercle",type=Cercle.class)})
	//la liste ds forme 
	private ArrayList<Forme> formes1=new ArrayList<Forme>();
	//getter et setter de la forme

	public ArrayList<Forme> getFormes() {
		return formes1;
	}

	public void setFormes(ArrayList<Forme> formes) {
		this.formes1 = formes;
	}
	
	//methode d ajouter une formes
	public void AjouterForme(Forme f){formes1.add(f);}
	//la methode pour supprimer une forme
	   public void supprimerFormes() { formes1.clear(); }
}
