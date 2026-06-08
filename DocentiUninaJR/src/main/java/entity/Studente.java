package entity;
import entity.*;
import jakarta.persistence.ManyToMany;

import java.util.*;

public class Studente extends Utente {

	@ManyToMany(mappedBy="studenti")
	private SortedSet<Corso> corsiStudente = new TreeSet<Corso>() {} ;//far implementare gli override a intellij

	public void IscrivitiaCorso() {
		// TODO - implement Studente.IscrivitiaCorso
		throw new UnsupportedOperationException();
	}

	public void ConsultaMatCorso() {
		// TODO - implement Studente.ConsultaMatCorso
		throw new UnsupportedOperationException();
	}

	public void VisualizzaProfiloDocente() {
		// TODO - implement Studente.VisualizzaProfiloDocente
		throw new UnsupportedOperationException();
	}

	public SortedSet<Corso> getCorsiStud(){
		return corsiStudente;
	}
}
