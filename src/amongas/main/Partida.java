package amongas.main;

import java.util.Scanner;

public class Partida {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int resp = 0;
//		System.out.println("ingresar nombre de jugador");
//		resp = scanner.nextInt();
		
		AmongasBLImp imp=new AmongasBLImp();
		
		System.out.println("Empezar Partida?");
		resp = scanner.nextInt();
		
		while (resp != 0) {
			
			if (resp == 1) {
				System.out.println(imp.empezarPartida(10, 2));
				System.out.println("Otra partida?");
			} else {
				System.out.println("Opcion incorrecta");
				resp = scanner.nextInt();
			}
			resp = scanner.nextInt();
		}
		
		System.out.println("Salida");
		System.exit(0);

	}

	
}
