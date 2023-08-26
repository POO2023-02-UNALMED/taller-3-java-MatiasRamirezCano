package taller3.televisores;

public class TV {
	
	Marca marca;
	int canal;
	int precio;
	boolean estado;
	int volumen;
	Control control;
	static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		canal = 1;
		volumen = 1;
		precio = 500;
		numTV++;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if (estado == false && canal >= 1 && canal <= 120) {
		    this.canal = canal;
	    }
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getVolumen() {
		return volumen;	
	}
	public void setVolumen(int volumen) {
		if (estado == false && volumen >= 0 && volumen <= 7) {
		    this.volumen = volumen;
		}
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public void turnOn() {
		if (estado == true) {
			estado = false;
		}
	}
	public void turnOff() {
		if (estado == true) {
			estado = false;
		}
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (canal < 120 && this.getEstado() == false) {
			canal++;
		}
	}
	public void canalDown() {
		if (canal > 1 && this.getEstado() == false) {
		    canal--;
		}
	}
	
	public void volumenUp() {
		if (volumen < 7 && this.getEstado() == false) {
		    volumen++;
		}
	}
	public void volumenDown() {
		if (volumen > 0 && this.getEstado()== false) {
		    volumen--;
		}
	}
	
}
