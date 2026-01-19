package Reto;

public class Catamaran extends Barco {

	protected Motor motorsecundario;

	public Catamaran(String nombre, Motor motor, double capacidadCombusitble, Motor motorsecundario) {
		super(nombre, motor, capacidadCombusitble);
		this.motorsecundario = motorsecundario;
	}

	public Motor getMotorsecundario() {
		return motorsecundario;
	}

	public void setMotorsecundario(Motor motorsecundario) {
		this.motorsecundario = motorsecundario;
	}

	@Override
	public double calcuarAutonomia() {
		// TODO Auto-generated method stub
		return (capacidadCombusitble/motor.consumo + capacidadCombusitble / motorsecundario.consumo) / 2;
	}

	@Override
	public String toString() {
		return "Catamaran: " + motorsecundario + " | " + super.toString();
	}
	
	
	
	
}
