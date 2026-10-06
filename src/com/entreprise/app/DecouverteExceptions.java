package com.entreprise.app;

import com.entreprise.compta.Facture;

public class DecouverteExceptions {
	
	public static void main(String[] args) {
        try {
            double[] primes = new double[3];
            primes[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {//cette exception pour les indices inexistant dans le tableau 
            System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
        }
        
        try {
        	double m=Double.parseDouble("abc");
        }catch(NumberFormatException e) {//cette exception pour la conversion de chaine de caractere en double 
        	System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
        }
        
        try {
            Facture f = null;
            f.getMontantAPayer();//un objet null
        } catch (NullPointerException e) {
            System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
        }

        try {
        	int parseParPersonne=9000/0;
        }catch (ArithmeticException e) {// division par 0
        	System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
        }finally {
        	System.out.println("Fin des essais");
        }
        

	}
}
