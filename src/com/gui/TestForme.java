package com.gui;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

import com.JAXB.PourTrace;
import com.bo.Caree;
import com.bo.Cercle;
import com.bo.Ligne;
import com.bo.Rectangle;
import com.bo.Triangle;

public class TestForme extends JFrame {
   private PourTrace dessins = new PourTrace();
   private JRadioButton Cercle = new JRadioButton("Cercle", true);
   private JRadioButton Ligne = new JRadioButton("Ligne", true);
   private JRadioButton Rectangle = new JRadioButton("Rectangle", true);
   private JRadioButton Triangle = new JRadioButton("Triangle", true);
   private JRadioButton Caree = new JRadioButton("Caree",true);
   private JFormattedTextField largeur = new JFormattedTextField(400);
   private ButtonGroup groupe = new ButtonGroup();
   private JPanel boutons = new JPanel();
   private JToolBar barre = new JToolBar();

   public TestForme() {
      super("drow  Forms");
      add(barre, BorderLayout.NORTH);
      barre.add(new AbstractAction("effacer", new ImageIcon("effacer.jpg")) {
         public void actionPerformed(ActionEvent e) {
            dessins.effacer();
         }
      });
      barre.add(new AbstractAction("UnMarshalling", new ImageIcon("Capture22.PNG")) {
         public void actionPerformed(ActionEvent e) {
           
				dessins.UnMarshalling();
			
         }
      });
      barre.add(new AbstractAction("Marshalling", new ImageIcon("Capture11.PNG")) {
         public void actionPerformed(ActionEvent e) {
           
				dessins.Marshalling();
			
         }
      });
      dessins.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            int larg = (Integer)largeur.getValue();
          
            if (Cercle.isSelected()) dessins.ajoutForme(new Cercle(e.getX(), e.getY(),larg/3));
             if(Caree.isSelected()){  dessins.ajoutForme(new Caree(e.getX(), e.getY(), larg/2));}
            if(Ligne.isSelected())   {dessins.ajoutForme(new Ligne(e.getX(), e.getY()));}
            if(Rectangle.isSelected()){dessins.ajoutForme(new Rectangle(e.getX(), e.getY(), larg/2,larg/3));}
            if(Triangle.isSelected()){dessins.ajoutForme(new Triangle());}
         }
      });
      add(dessins);
      largeur.setColumns(5);
      boutons.add(Cercle);
      boutons.add(Caree);
      boutons.add(largeur);
      boutons.add(Triangle);
      boutons.add(Ligne);
      
      groupe.add(Ligne);
      groupe.add(Triangle);
      groupe.add(Ligne);
      groupe.add(Caree);
      groupe.add(Rectangle);
      groupe.add(Cercle);
      add(boutons, BorderLayout.SOUTH);
      setSize(400, 500);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
   }

   public static void main(String[] args) { new TestForme();
   
   
   
   
   
   
   
   
   }}

   