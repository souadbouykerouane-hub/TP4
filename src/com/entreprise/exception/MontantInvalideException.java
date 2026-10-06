package com.entreprise.exception;

public class MontantInvalideException  extends Exception {
	
    private double valeur;
	
	public MontantInvalideException (String champ,double valeur) {//Constructeur de l'exception
		super(champ +"salaire invalide"+valeur);
		this.valeur=valeur;
	}
	public double getValeur() {
		return valeur;
	}
	

}
