package entity;
import entity.*;
import jakarta.persistence.OneToMany;

import java.util.*;

public class Docente extends Utente {

	@OneToMany(mappedBy = "gestore")
	private SortedSet<Corso> corsiDocente = new TreeSet<Corso>() {
		@Override
		public Comparator<? super Corso> comparator() {
			return null;
		}

		@Override
		public SortedSet<Corso> subSet(Corso fromElement, Corso toElement) {
			return null;
		}

		@Override
		public SortedSet<Corso> headSet(Corso toElement) {
			return null;
		}

		@Override
		public SortedSet<Corso> tailSet(Corso fromElement) {
			return null;
		}

		@Override
		public Corso first() {
			return null;
		}

		@Override
		public Corso last() {
			return null;
		}

		@Override
		public int size() {
			return 0;
		}

		@Override
		public boolean isEmpty() {
			return false;
		}

		@Override
		public boolean contains(Object o) {
			return false;
		}

		@Override
		public Iterator<Corso> iterator() {
			return null;
		}

		@Override
		public Object[] toArray() {
			return new Object[0];
		}

		@Override
		public <T> T[] toArray(T[] a) {
			return null;
		}

		@Override
		public boolean add(Corso corso) {
			return false;
		}

		@Override
		public boolean remove(Object o) {
			return false;
		}

		@Override
		public boolean containsAll(Collection<?> c) {
			return false;
		}

		@Override
		public boolean addAll(Collection<? extends Corso> c) {
			return false;
		}

		@Override
		public boolean retainAll(Collection<?> c) {
			return false;
		}

		@Override
		public boolean removeAll(Collection<?> c) {
			return false;
		}

		@Override
		public void clear() {

		}
	};
	//traduzione del "Uno" nel rapporto 1-M di Docente-corso



	public void CreaCorso() {
		// TODO - implement Docente.CreaCorso
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param titolo
	 */
	public void CreaSez(String titolo) {

		throw new UnsupportedOperationException();
	}
	public void CreaSez(String titolo, Sezione superSez) {
		// TODO - implement Docente.CreaSez
		throw new UnsupportedOperationException();
	}	
	//Potrebbe non essere necessario l'overload qui dato che già è stato fatto sui costruttori di Sezione

	
	public void IscriviStud() {
		// TODO - implement Docente.IscriviStud
		throw new UnsupportedOperationException();
	}

	public void PubMat() {
		// TODO - implement Docente.PubMat
		throw new UnsupportedOperationException();
	}

	public void ModMat() {
		// TODO - implement Docente.ModMat
		throw new UnsupportedOperationException();
	}

	public void ViewStats() {
		// TODO - implement Docente.ViewStats
		throw new UnsupportedOperationException();
	}

	public void getDataforStudent() {
		// TODO - implement Docente.getDataforStudent
		throw new UnsupportedOperationException();
	}

	public Set<Corso> getCorsiDocente(){
		return corsiDocente;
	}
	/**
	 * 
	 * @param titolo
	 * @param superSez
	 */


}
