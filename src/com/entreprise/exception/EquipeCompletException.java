package com.entreprise.exception;

public class EquipeCompletException  extends RuntimeException{
	
	public EquipeCompletException (int capacite) {
		super("Equipe compléte (capacite:" +capacite +")");
	}

}
