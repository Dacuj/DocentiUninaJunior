package entity;
import jakarta.persistence.*;

import java.util.*;

@Entity
public class Corso {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) //PK autoincrementale, gestita da DB
	private int Id;

	private int Titolo;
	private int Codice;
	private int AnnoAcc;

	@ManyToOne
	@JoinColumn(name = "gestore")
	private Docente gestore;
	//chiave esterna per DB e traduzione del "Molti" nella relazione 1-M tra Docente e Corso


	@ManyToMany
	@JoinTable(name = "STUDENTI_CORSO")
	public SortedSet<Studente> listaIscritti = new TreeSet<Studente>() {
		@Override
		public Comparator<? super Studente> comparator() {
			return null;
		}

		@Override
		public SortedSet<Studente> subSet(Studente fromElement, Studente toElement) {return null;}

		@Override
		public SortedSet<Studente> headSet(Studente toElement) {return null;}

		@Override
		public SortedSet<Studente> tailSet(Studente fromElement) {return null;}

		@Override
		public Studente first() {return null;}

		@Override
		public Studente last() {return null;}

		@Override
		public int size() {return 0;}

		@Override
		public boolean isEmpty() {return false;}

		@Override
		public boolean contains(Object o) {return false;}

		@Override
		public Iterator<Studente> iterator() {return null;}

		@Override
		public Object[] toArray() {return new Object[0];}

		@Override
		public <T> T[] toArray(T[] a) {return null;}

		@Override
		public boolean add(Studente studente) {return false;}

		@Override
		public boolean remove(Object o) {return false;}

		@Override
		public boolean containsAll(Collection<?> c) {return false;}

		@Override
		public boolean addAll(Collection<? extends Studente> c) {return false;}

		@Override
		public boolean retainAll(Collection<?> c) {return false;}

		@Override
		public boolean removeAll(Collection<?> c) {return false;}

		@Override
		public void clear() {}
	};
	//Set è una Collection che di base non permette duplicati
	//SortedSet è una estensione di set che inserisce automaticamente gli elementi in ordine ascendente
	//SortedSet è una interfaccia, non permette di istanziare direttamente oggetti
	//TreeSet è una specializzazione di SortedSet che non permette nemmeno oggetti null
	//TreeSet pretende che le classi in esso contenute implementino Comparable o Comparator a seconda delle esigenze (a noi serve Comparator)
	//IntelliJ ha inserito automaticamente tutti gli override per i metodi di questa interfaccia, eliminare se e dove necessario
	//https://www.geeksforgeeks.org/java/treeset-in-java-with-examples/ per istruzioni sui metodi dell'interfaccia

	@OneToMany(mappedBy = "SEZIONI_CORSO")
	private SortedSet<Sezione> listaSezioni = new TreeSet<Sezione>() {
		@Override
		public Comparator<? super Sezione> comparator() {
			return null;
		}

		@Override
		public SortedSet<Sezione> subSet(Sezione fromElement, Sezione toElement) {
			return null;
		}

		@Override
		public SortedSet<Sezione> headSet(Sezione toElement) {
			return null;
		}

		@Override
		public SortedSet<Sezione> tailSet(Sezione fromElement) {
			return null;
		}

		@Override
		public Sezione first() {
			return null;
		}

		@Override
		public Sezione last() {
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
		public Iterator<Sezione> iterator() {
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
		public boolean add(Sezione sezione) {
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
		public boolean addAll(Collection<? extends Sezione> c) {
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
	//Ditto



	//void static AddSezione(Sezione sezione) {}

	public void DelSezione() {
		// TODO - implement Corso.DelSezione
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sezione
	 */
	public boolean SezioneEsiste(Sezione sezione) {
		// TODO - implement Corso.SezioneEsiste
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newStudente
	 */
	public void AggiungiStud(Studente newStudente) {
		listaIscritti.add(newStudente);
		//throw new UnsupportedOperationException();
	}

	public SortedSet getListaIscritti() {
		return listaIscritti;
		//throw new UnsupportedOperationException();
	}

	/**
	 * Controlla nella lista corsi e vede se c'� una corrispondenza con il parametro Studente fornito
	 * @param studente
	 */
	public boolean studenteIsIscritto(Studente studente) {
		// TODO - implement Corso.studenteIsIscritto
		throw new UnsupportedOperationException();
	}

	public SortedSet getListaMatVisibili() {
		// TODO - implement Corso.getListaMatVisibili
		throw new UnsupportedOperationException();
	}

	public int getNumMat() {
		// TODO - implement Corso.getNumMat
		throw new UnsupportedOperationException();
	}

	public int getNumIscritti() {
		// TODO - implement Corso.getNumIscritti
		throw new UnsupportedOperationException();
	}

	public Map getMatPerCat() {
		// TODO - implement Corso.getMatPerCat
		throw new UnsupportedOperationException();
	}

}
