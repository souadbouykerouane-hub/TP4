package com.entreprise.compta;

public class Facture implements Payable  {
	
	private String numero;
	private String fournisseur;
	private double montant;
	
	public Facture(String numero,String fournisseur,double montant) {
		this.numero=numero;
		this.fournisseur=fournisseur;
		this.montant=montant;
		
		
	}
    public  double getMontantAPayer() {
    	return montant;
		
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	 public String tostring() {
	    	return "Facture F "+ numero+"("+ fournisseur + ")"+ montant;
	    }



}
