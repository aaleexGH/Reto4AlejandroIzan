package Reto;

public class Yate extends Barco {
	protected int camarotes;

	public Yate(String nombre, Motor motor, double capacidadCombusitble, int camarotes) {
		super(nombre, motor, capacidadCombusitble);
		this.camarotes = camarotes;
	}

	public int getCamarotes() {
		return camarotes;
	}

	public void setCamarotes(int camarotes) {
		this.camarotes = camarotes;
	}

	@Override
	public String toString() {
		return "Yate: " + camarotes + "| " + super.toString();
	}
	
	
}
