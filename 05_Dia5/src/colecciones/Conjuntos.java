package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Conjuntos son colecciones que no admiten duplicados
		
		HashSet<Integer> numerosLocos = new HashSet<Integer>();
		TreeSet<Integer> numerosOrdenados = new TreeSet<Integer>();
		
		
		
		//Añadir numeros locos con bucle
		
		for(int i = 0;i<50;i++) {
			numerosLocos.add((int)(Math.random()*10));
		}
		
		for(Integer i : numerosLocos) {
			System.out.print(i + " ");
		}
		
		
		TreeSet<String> cadenasOrdenadas = new TreeSet<String>();
		cadenasOrdenadas.add("David Varela");
		cadenasOrdenadas.add("Francisco Galiñanes");
		cadenasOrdenadas.add("Adrian Costas");
		cadenasOrdenadas.add("Adrian Costas");
		
		
		for(String c : cadenasOrdenadas) {
			System.out.println(c);
		}
		
		//Mapas
		HashMap<String,Jugador> mapa = new HashMap<String,Jugador>();
		
		mapa.put("AQ23", new Jugador("AQ23","Pepinho",450));
		mapa.put("WER34", new Jugador("WER34","Martin",500));
		mapa.put("Q341", new Jugador("Q341","No llores más",900));
		
		//Búsquedas por clave
		Jugador j = mapa.get("AQ23");
				
		System.out.println(j);
		
		//No hay for each capaz de recorrer directamente un mapa
		
		//Obteniendo las claves
		Set<String> claves = mapa.keySet();
		
		System.out.println("Las claves son: ");
		for(String c : claves) {
			System.out.println(c);
		}
		
		//Obteniendo los valores
		Collection<Jugador> valores = mapa.values();
		
		System.out.println("Los valores son: ");
		for(Jugador ju : valores) {
			System.out.println(ju);
		}
		
		//Obtener las entradas -->Entry<clave,valor>
		Set<Entry<String,Jugador>> entradas = mapa.entrySet();
		System.out.println("Las entradas son :");
		for(Entry<String,Jugador> entrada : entradas) {
			System.out.println(entrada.getKey()+ " " + entrada.getValue());
		}
		
		
		
		
		
		
		
		ArrayList<Integer> notas = new ArrayList<Integer>();
		
		notas.add(4);
		notas.add(5);
		notas.add(8);
		
		HashMap<String,ArrayList<Integer>> todaLaInfoDelMundo = 
				new HashMap<String,ArrayList<Integer>>();
		
		todaLaInfoDelMundo.put("56453423S",notas);
		
		ArrayList<Integer> notas2 = todaLaInfoDelMundo.get("56453423S");
		
		
		
		
		
		
		
		
		
		
		
	}

}
