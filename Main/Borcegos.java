package Main;

public class Borcegos extends Calzado {

	private int ID;
	private int talla;
	private float Precio;
	
	private Borcegos (int ID, int talla, float Precio) {
		super (ID, talla, Precio);
		this.ID = ID;
		this.talla = talla;
		this.Precio = Precio;
	}

	private int SetID() {
		return ID;
	}

	private int SetTalla() {
		return talla;
	}

	private float SetPrecio() {
		return Precio;
	}
	

	private int GetID() {
		return ID;
	}

	private int GetTalla() {
		return talla;
	}

	private float GetPrecio() {
		return Precio;
	}


}

