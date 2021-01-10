package amongas.main;

public class Impostor extends Persona {

	public Impostor(String nombre, String color) {
		super(nombre, color);
		// TODO Auto-generated constructor stub
	}

	public String Asesinar(Tripulante tripulante) {
		return "Has asesinado a " + tripulante.getNombre();
	}
}
