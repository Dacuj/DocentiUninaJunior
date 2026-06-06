package entity;
import entity.*;

import java.util.List;

public class CatalogoUtenti {

	private Utente CurrentUtente;

	private static CatalogoUtenti istanza = null;
	private CatalogoUtenti(){};
	public static CatalogoUtenti getIstanza(){
		if(istanza == null) istanza = new CatalogoUtenti();
		return istanza;}
	//Traduzione: vedi CatalogoCorsi




	public void trovaUtente(Utente Utente) {
		// TODO - implement CatalogoUtenti.trovaUtente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newUtente
	 */
	public void addUtente(Utente newUtente) {
		// TODO - implement CatalogoUtenti.addUtente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param mail
	 * @param password
	 */
	public boolean MatchCredentials(String mail, String password) {
		// TODO - implement CatalogoUtenti.MatchCredentials
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param mail
	 */
	public boolean MatchCredentials(String mail) {
		// TODO - implement CatalogoUtenti.MatchCredentials
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param campoRicerca
	 */
	public List trovaUtente(String campoRicerca) {
		// TODO - implement CatalogoUtenti.trovaUtente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param campoRicerca1
	 * @param campoRicerca2
	 */
	public List trovaUtente(String campoRicerca1, String campoRicerca2) {
		// TODO - implement CatalogoUtenti.trovaUtente
		throw new UnsupportedOperationException();
	}

}