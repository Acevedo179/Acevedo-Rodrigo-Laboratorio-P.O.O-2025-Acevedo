package Main;

public class Electrodomestico {

	private String Marca;
	private int precioBase;
	
	private Electrodomestico (String Marca, int precioBase) {
		this.Marca = Marca;
		this.precioBase = precioBase;
	}
	
	private String SetMarca() {
		return Marca;
	}
	
	private String GetMarca() {
		return Marca;
	}

	private int SetPrecioBase() {
		return precioBase;
	}

	private int GetPrecioBase() {
		return precioBase;
	}
}
