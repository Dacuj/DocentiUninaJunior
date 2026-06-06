package entity;
import entity.*;
import jakarta.persistence.ManyToMany;

import java.util.Set;

public class Studente extends Utente {

	@ManyToMany(mappedBy="studenti")
	private Set<Corso> corsiStudente ;

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

	public Set<Corso> getCorsiStud(){
		return corsiStudente;
	}
}