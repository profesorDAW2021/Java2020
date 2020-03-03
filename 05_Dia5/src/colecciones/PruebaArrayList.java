package colecciones;

import java.util.*;
public class PruebaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear una lista de Strings
		ArrayList<String> alumnos = new ArrayList<String>();
		ArrayList listaGlobal = new ArrayList();
		listaGlobal.add(new Jugador("34rt","Pepinho",560));
		listaGlobal.add("Hola pepinho");
		listaGlobal.add(45);
		
		for(int i = 0;i<listaGlobal.size();i++) {
			System.out.println(listaGlobal.get(i));
		}
		
		for(Object j : listaGlobal) {
			System.out.println(((Jugador)j).getCodigo());
		}
		
		
		
		
		
		
		
		

	}

}
