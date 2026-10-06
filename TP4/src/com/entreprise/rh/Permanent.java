package com.entreprise.rh;

import com.entreprise.exception.MontantInvalideException;

public class Permanent extends Employe implements Augmentable {
	
	 private double salaireMensuel;
	 
	 public Permanent(String nom, double salaire) throws MontantInvalideException  {
	 super(nom);
	 if (salaire <= 0) {
		 throw new  MontantInvalideException("salaire",salaire);
	 }
	 this.salaireMensuel = salaire;
	 }
	 
	 public Permanent(String nom, double salaire, String agence) throws MontantInvalideException  {
	       super(nom, agence);
	       if (salaire <= 0) {
	    	   throw new  MontantInvalideException("salaire",salaire);
	    	          }
	 this.salaireMensuel = salaire;
	 }
	 
	 @Override
	 public String getPoste() { return "Permanent"; }
	 
	 @Override
	 public double getSalaire() { return salaireMensuel; }
	 
	 @Override
	 public String toString() {
	 return getPoste() + "[" + super.toString() + ", salaire=" + getSalaire() + "]";
	 }
	 
	 public void augmenter(double taux)throws MontantInvalideException{
		 if(taux<=0 || taux>TAUX_MAX) {
			 throw new  MontantInvalideException("taux",taux); 
		 }
		 this.salaireMensuel *=(1 + taux);
	 }

	 @Override
	 public double getMontantAPayer() {
		// TODO Auto-generated method stub
		return 0;
	 }

	 @Override
	 public int compareTo(Employe o) {
		// TODO Auto-generated method stub
		return 0;
	 }
	}