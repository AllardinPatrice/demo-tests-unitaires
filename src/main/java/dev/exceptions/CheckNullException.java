package dev.exceptions;

/**
 * Classe Exception à Null pour la gestion des tests unitaires
 * 
 * @author Patrice
 *
 */
public class CheckNullException extends Exception {

	public CheckNullException() {

	}

	public CheckNullException(String message) {
		super(message);
	}

}
