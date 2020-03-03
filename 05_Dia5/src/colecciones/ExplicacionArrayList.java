package colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class ExplicacionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> lista = new ArrayList<String>();
		
		//Métodos de un arraylist
		//add(Objeto a)
		lista.add("12345678U");
		lista.add("90909090E");
		
		//Obtener un elemento -->get(indice)
		String cadena = lista.get(0);
		
		//Obtener el número de elmentos guardados --> size()
		int elementos = lista.size();
		
		boolean encontrado = lista.contains("12344567W");
		
		//Eliminar un objeto de una lista
		lista.remove(0);
		
		lista.remove("12345678W");
		
		//Recorrer una lista
		for(int i = 0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		
		ArrayList<Jugador> equipo = new ArrayList<Jugador>();
		
		equipo.add(new Jugador("123","Roi no duermas",345));
		equipo.add(new Jugador("we34","Hola Mundo",900));
		
		//Solicitar un código por teclado y eliminar ese jugador del equipo
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un código");
		String codigo = lector.nextLine();
		
		for(Jugador j : equipo) {
			if(j.getCodigo().equals(codigo)) {
				equipo.remove(j);
				//break;
			}
		}
		
		for(Jugador j:equipo) {
			System.out.println(j);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
