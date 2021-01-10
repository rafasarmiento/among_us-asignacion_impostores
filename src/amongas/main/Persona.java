package amongas.main;

public class Persona {

	private String nombre;
	
	private String color;

	public Persona(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String emergencia() {
		return this.nombre + " ha invocado una reunion de emergencia.";
	}
	
}
