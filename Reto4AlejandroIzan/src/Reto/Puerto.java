package Reto;

import java.util.ArrayList;

public class Puerto {
	protected ArrayList<Barco> barcos;
	protected String nombre;
	protected int maximoBarcos = 4;
	public boolean entrarBarco(Barco b) {
		if (barcos.size()> maximoBarcos) {
			barcos.add(b);
			return true;
		}else {
			return false;
		}
	}
	public Puerto(ArrayList<Barco> barcos, String nombre, int maximoBarcos) {
		super();
		this.barcos = barcos;
		this.nombre = nombre;
		this.maximoBarcos = maximoBarcos;
	}
	public ArrayList<Barco> getBarcos() {
		return barcos;
	}
	public void setBarcos(ArrayList<Barco> barcos) {
		this.barcos = barcos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMaximoBarcos() {
		return maximoBarcos;
	}
	public void setMaximoBarcos(int maximoBarcos) {
		this.maximoBarcos = maximoBarcos;
	}
	@Override
	public String toString() {
		return "Puerto [barcos=" + barcos + ", nombre=" + nombre + ", maximoBarcos=" + maximoBarcos + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
