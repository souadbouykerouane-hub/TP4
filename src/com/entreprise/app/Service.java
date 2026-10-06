package com.entreprise.app;

import com.entreprise.exception.EquipeCompletException;
import com.entreprise.rh.Employe;
import java.util.Arrays;

public class Service {
	
		private Employe[] employes;
		private int nb;

		 public Service(int capacite) {
		        this.employes = new Employe[capacite];
		        this.nb = 0;
		    }

		    public void ajouter(Employe e) {
		        if (nb >= employes.length) {
		            throw new EquipeCompletException(employes.length);
		        }
		        employes[nb] = e;
		        nb++;
		    }
		    
		    public Employe getEmploye(int i) { 
		    	if(i<0 || i>=nb) {
		    		throw new IllegalArgumentException("Indice invalide:"+i);
		    	}
		    	return employes[i];
		    }
		    
		    public int getNb() {return nb;}
		    
		    public double getMasseSalariale() {
		        double somme = 0;
		        for (int i = 0; i < nb; i++) somme += employes[i].getSalaire();
		        return somme;
		    }

		    public void trier() {
		        Arrays.sort(employes, 0, nb);
		    }

		    public void afficher() {
		    	for(int i=0 ; i<nb;i++) {
		    		System.out.println(i+":"+employes[i]);
		    	}
		    }


}
