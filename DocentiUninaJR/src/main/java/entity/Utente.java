package entity;
import entity.*;
import jakarta.persistence.Id;

public abstract class Utente implements Comparator<Utente>{
	//non so se implementare Comparator qui e sfruttare l'ereditarietà, o implementarlo in docente e studente
	//anyway, compara nome, cognome e ruolo, da decidere in che ordine
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
