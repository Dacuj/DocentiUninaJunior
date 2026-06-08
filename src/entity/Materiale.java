package entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Materiale {

	private int Titolo;
	private int Descr;
	private boolean Visibilita;
	private int datapub;
	private Categoria categoria;

	@ManyToOne
	@JoinColumn(name = "sezione")
	private Sezione sezione;

	public void Edit() {
		// TODO - implement Materiale.Edit
		throw new UnsupportedOperationException();
	}

	public Boolean wasThenHidden() {//memorizza la visibilità precedente a una modifica
		//throw new UnsupportedOperationException();

		return Visibilita;
	}

	public Boolean isNowHidden() {

		//throw new UnsupportedOperationException();
		return Visibilita;
	}

	public void setToHidden() {
		Visibilita=false;
		// TODO - implement Materiale.setToHidden
		//throw new UnsupportedOperationException();
	}

	public void getAllData() {
		// TODO - implement Materiale.getAllData
		throw new UnsupportedOperationException();
	}

}