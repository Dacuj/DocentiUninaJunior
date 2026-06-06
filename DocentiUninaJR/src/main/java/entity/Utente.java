package entity;
import entity.*;
import jakarta.persistence.Id;

public class Utente {

	@Id
	private int mail;

	private int nome;
	private int cognome;
	private int password;
	private int ruolo;

	public void RicercaFiltrata() {
		// TODO - implement Utente.RicercaFiltrata
		throw new UnsupportedOperationException();
	}

}