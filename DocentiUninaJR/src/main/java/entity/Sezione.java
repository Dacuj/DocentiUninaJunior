package entity;
import entity.*;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.*;

public class Sezione {

	@Id
	private String titolo;

	private Sezione supersezione;

	@ManyToOne
	@JoinColumn(name = "SEZIONI_CORSO")
	private Corso corsoAppartenenza;

	@OneToMany(mappedBy = "sezione")
	private SortedSet<Materiale> listaMaterialiSezione = new TreeSet<Materiale>() {//gli override vanno rigenerati
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
		public Iterator<Materiale> iterator() {
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
		public boolean add(Materiale materiale) {
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
		public boolean addAll(Collection<? extends Materiale> c) {
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

		@Override
		public boolean equals(Object o) {
			return false;
		}

		@Override
		public int hashCode() {
			return 0;
		}

		@Override
		public Comparator<? super Materiale> comparator() {
			return null;
		}

		@Override
		public SortedSet<Materiale> subSet(Materiale fromElement, Materiale toElement) {
			return null;
		}

		@Override
		public SortedSet<Materiale> headSet(Materiale toElement) {
			return null;
		}

		@Override
		public SortedSet<Materiale> tailSet(Materiale fromElement) {
			return null;
		}

		@Override
		public Materiale first() {
			return null;
		}

		@Override
		public Materiale last() {
			return null;
		}
	};

	//NOTA:Sezione è contenuta strettamente in Corso. Modificare di conseguenza
	public Sezione(){};
	public Sezione(String titolo){
		this.titolo = titolo;
		supersezione = null;
		//questo costruttore viene invocato quando creo una sezione principale, quindi setta da solo la supersezione a null
		//occhio a sto null perchè poi dobbiamo implementare controlli
		//controllare se TreeSet lo accetta, se è NO cambiare a un valore tipo '0'
	}
	public Sezione(String titolo, Sezione supersezione){
		this.titolo = titolo;
		this.supersezione = supersezione;
		//questo costruttore viene invocato quando creo una sottosezione, quindi si specifica anche la supersezione
	}


	/**
	 * 
	 * @param newMat
	 */
	public void addMat(Materiale newMat) {
		// TODO - implement Sezione.addMat
		throw new UnsupportedOperationException();
	}

	public void DelMat() {
		// TODO - implement Sezione.DelMat
		throw new UnsupportedOperationException();
	}

	public void getMatList() {
		// TODO - implement Sezione.getMatList
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param subSezione
	 */
	public void addSubSez(Sezione subSezione) {
		// TODO - implement Sezione.addSubSez
		throw new UnsupportedOperationException();
	}

}
