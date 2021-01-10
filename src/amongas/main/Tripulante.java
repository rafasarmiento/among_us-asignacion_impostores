package amongas.main;

public class Tripulante extends Persona {

	public Tripulante(String nombre, String color) {
		super(nombre, color);
		// TODO Auto-generated constructor stub
	}

	public String hacertareas() {
		return "haciendo tareas";
	}
	
	public String reportar(Tripulante cadaver) {
		return this.getNombre() + " Ha reportado el cadaver de " + cadaver.getNombre();
	}
	
}
