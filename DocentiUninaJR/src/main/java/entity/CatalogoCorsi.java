package entity;
import entity.*;
import jakarta.persistence.OneToMany;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
public class CatalogoCorsi {

	private static CatalogoCorsi istanza = null;
	private CatalogoCorsi(){};
	public static CatalogoCorsi getIstanza(){
		if(istanza == null) istanza = new CatalogoCorsi();
		return istanza;}
	//Traduzione: CatalogoCorsi è un Singleton e come tale può essere solo uno, e creato chiamando getIstanza nel main per evitare casino

	/*@OneToMany(mappedBy = "CatalogoCorsi")
	private SortedSet<Corso> catalogoCorsi = new TreeSet<Corso>(){
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
	};*/




	public void AddCorso(Corso newCorso) {
		// TODO - implement CatalogoCorsi.AddCorso
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param codice
	 */
	public Corso FindCorso(String codice) {
		// TODO - implement CatalogoCorsi.FindCorso
		throw new UnsupportedOperationException();
	}

	public void DelCorso() {
		// TODO - implement CatalogoCorsi.DelCorso
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param docente
	 */
	public void getlistaCorsiDocente(Docente docente) {
		// TODO - implement CatalogoCorsi.listaCorsiDocente
		docente.getCorsiDocente();
		//throw new UnsupportedOperationException();
	}

}
