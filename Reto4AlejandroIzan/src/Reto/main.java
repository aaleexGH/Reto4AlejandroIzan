package Reto;

public class main {

	public static void main(String[] args) {
		
		
		Puerto puerto = new Puerto(null, "Marina", 0);
		
		Motor motor1 = new Motor("Motor1",500,4.5);
		Motor motor2 = new Motor("Motor2",600,9.5);
		Motor motor3 = new Motor("Motor3",300,3.5);
		
		Yate yate1 = new Yate("Yate1",motor1,750,6);
		Yate yate2 = new Yate("Yate2",motor1,750,5);
		
		Catamaran cat1 = new Catamaran("Catamaran1", motor1, 600, motor3);
		Catamaran cat2 = new Catamaran("Catamaran1", motor2, 900, motor3);
		
		puerto.entrarBarco(yate1);
		puerto.entrarBarco(yate2);
		puerto.entrarBarco(cat1);
		puerto.entrarBarco(cat2);
		
		System.out.println("barcos en el puerto: ");
		for (Barco b : puerto.getBarcos()) {
			System.out.println(b);
		}
		
		Barco max = puerto.getBarcos().get(0);
		Barco min = puerto.getBarcos().get(0);
		
		for (Barco b : puerto.getBarcos()) {
			if (b.calcuarAutonomia() > max.calcuarAutonomia()) {
				max = b;
			}
			if (b.calcuarAutonomia() < min.calcuarAutonomia()) {
				min = b;
			}
			
		}
		
		System.out.println(max.getNombre());
		System.out.println(min.getNombre());
		
	}

}
