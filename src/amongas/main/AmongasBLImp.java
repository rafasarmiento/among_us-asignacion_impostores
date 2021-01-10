package amongas.main;

import java.util.ArrayList;
import java.util.List;

public class AmongasBLImp {

	static int cantidadJugadores;
	static double rol;
	static List<Persona> jugadores = new ArrayList<Persona>();
	
	String agregarPersonaALaPartida(String nombre, Colores color) {
		Persona persona = new Persona(nombre, color.name());
		if (jugadores.size() < 10) {
			jugadores.add(persona);
		} else {
			return "La sala esta llena.";
		}
		return "jugador agregado";
	}

	String empezarPartida(int tripulantes, int impostores) {
		int cantidadImpostores = 0;
		List<Impostor> malos = new ArrayList<Impostor>(impostores);
		List<Tripulante> buenos = new ArrayList<Tripulante>(tripulantes);
		
		agregarPersonaALaPartida("p1", Colores.AZUL);
		agregarPersonaALaPartida("p2", Colores.AMARILLO);
		agregarPersonaALaPartida("p3", Colores.BLANCO);
		agregarPersonaALaPartida("p4", Colores.CIAN);
		agregarPersonaALaPartida("p5", Colores.MARRON);
		agregarPersonaALaPartida("p6", Colores.MORADO);
		agregarPersonaALaPartida("p7", Colores.NARANJA);
		agregarPersonaALaPartida("p8", Colores.NEGRO);
		agregarPersonaALaPartida("p9", Colores.ROJO);
		agregarPersonaALaPartida("p10", Colores.ROSADO);
		
		while (cantidadImpostores != impostores) {
		for (Persona persona : jugadores) {
			
				if (malos.size() != impostores) {
					/*
					 * genero un número random uno u otro de la siguiente forma:
					 * función random() * (máximo - mínimo) + mínimo
					 * en este caso en específico un número random entre 10 y 20 
					 */
					rol = Math.random() * (20 - 10) + 10;
					System.out.println("random = " + rol);
					boolean tripulante = true;
					if (rol >= 15) {
						tripulante = false;
					}
					
					if (tripulante) {
						buenos.add(new Tripulante(persona.getNombre(), persona.getColor()));
//						System.out.println("buenos hasta ahora: " + buenos.toString());
					} else {
						if (malos.size() < impostores) {
							malos.add(new Impostor(persona.getNombre(), persona.getColor()));
//							System.out.println("malos hasta ahora: " + malos.toString());
							cantidadImpostores++;
						}
					}
				} else {
					buenos.add(new Tripulante(persona.getNombre(), persona.getColor()));
//					System.out.println("buenos hasta ahora: " + buenos.toString());
				}

			}
		}
		
		String mensaje = "Partida iniciada: ";
		
			if (impostores == 1) {
				mensaje += malos.get(0).getNombre() + " es el Impostor.";
			} else if (impostores == 2) {
				mensaje += malos.get(0).getNombre() + " y " + malos.get(1).getNombre() + "son los Impostores.";
			} else {
				mensaje += malos.get(0).getNombre() + ", " + malos.get(1).getNombre() + " y " + malos.get(2).getNombre() + " son los Impostores.";
			}
			
		
		return mensaje;
	}
	
}
