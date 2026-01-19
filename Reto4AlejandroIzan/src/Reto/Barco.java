package Reto;


public class Barco {

	protected String Nombre;
	protected Motor motor;
	protected double capacidadCombusitble;
	
	public Barco(String nombre, Motor motor, double capacidadCombusitble) {
		super();
		Nombre = nombre;
		this.motor = motor;
		this.capacidadCombusitble = capacidadCombusitble;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public double getCapacidadCombusitble() {
		return capacidadCombusitble;
	}

	public void setCapacidadCombusitble(double capacidadCombusitble) {
		this.capacidadCombusitble = capacidadCombusitble;
	}
	
	@Override
	public String toString() {
		return "Barco [Nombre=" + Nombre + ", motor=" + motor + ", capacidadCombusitble=" + capacidadCombusitble
				+ ", toString()=" + super.toString() + "]";
	}

	public void calcuarAutonomia() {
		
	}

	
	
	
}
