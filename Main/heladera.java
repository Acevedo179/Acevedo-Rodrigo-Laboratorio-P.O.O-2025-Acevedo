package Main;

public class heladera extends Electrodomestico{

	private String Marca;
	private int precioBase;
	
	private heladera (String Marca, int precioBase) {
		super (Marca, precioBase);
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
	
	public void CalcularPrecioFinal() {
		System.out.println("El precio final es de " , precioBase);	
	}
}
