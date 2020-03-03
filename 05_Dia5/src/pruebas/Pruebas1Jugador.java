package pruebas;

import colecciones.Jugador;

public class Pruebas1Jugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jugador j1 = new Jugador("qw34","Junior Baiano",500);
		
		//Matrices estáticas de jugadores
		
		Jugador []equipo = new Jugador[10];
		
		//Llenar la matriz con objetos jugador por defecto
		for(int i = 0;i<equipo.length;i++) {
			equipo[i] = new Jugador();
			equipo[i].setCodigo("a"+i);
		}
		
		//Visualizar la matriz
		for(Jugador j : equipo) {
			System.out.println(j);
		}
		
		//Eliminar de la matriz el jugador con código a3
		for(int i = 0;i<equipo.length;i++) {
			if(equipo[i].getCodigo().equals("a3")) {
				equipo[i]= null;
				break;
			}
		}
		
		
		//Hay algún jugador cuyo código empiece por b?
		
		for(int i = 0;i<equipo.length;i++) {
			if(equipo[i]!=null) {
			if(equipo[i].getCodigo().startsWith("b")) {
				System.out.println(equipo[i]);
			}
			}
		}
		
		
		
		
		
		
		
	}

}
