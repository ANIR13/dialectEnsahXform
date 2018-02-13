package com.JAXB;


import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;

import javax.swing.JComponent;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.bo.Forme;
import com.bo.Formes;




public  class PourTrace extends JComponent {
   
	
	
	      private Formes formes = new Formes();
	      private Marshaller mapperObjetsXML;
	      private Unmarshaller mapperXMLObjets;
	      
	      public PourTrace() {
	         try {            
	            JAXBContext contexte = JAXBContext.newInstance(Formes.class);
	            mapperObjetsXML = contexte.createMarshaller();
	            mapperObjetsXML.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	            mapperXMLObjets = contexte.createUnmarshaller();
	         } 
	         catch (JAXBException ex) { System.out.println("Impossible de créer le document XML");  }
	      }

	      @Override
	      protected void paintComponent(Graphics g) {
	         super.paintComponent(g);
	         Graphics2D surface = (Graphics2D) g;
	         surface.setStroke(new BasicStroke(5));
	         surface.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	         if (formes!=null)
	            for (Forme forme : formes.getFormes()) forme.dessine(surface);
	      }

	      public void effacer() {
	         formes.supprimerFormes();
	         revalidate();
	         repaint();
	      }

	      public void ajoutForme(Forme forme) {
	         formes.AjouterForme(forme);
	         repaint();
	      }

	      public void Marshalling() {
	         try {
	            mapperObjetsXML.marshal(formes, new File("Formes.xml"));
	         }
	         catch (JAXBException ex) { System.out.println("Impossible de serialiser ");  }
	      }

	      public  void UnMarshalling() {
	         try { 
	        	
	            formes = (Formes) mapperXMLObjets.unmarshal(new File("Formes.xml"));
	        
	            repaint();
	         }
	         catch (JAXBException ex) { System.out.println("Impossible de deserialiser");  }
	      }
	   }

