package herenciaRepaso;

import java.util.ArrayList;

public class PruebaFiguras {

	static void hacerAlgo(Figura f) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Areable> lista = new ArrayList<Areable>();
		lista.add(new Circulo(3.4f));
		lista.add(new Cuadrado(3));
		lista.add(new Triangulo(3,9));
		lista.add(new Rectangulo(3,5));
		lista.add(new Amorfo());
		
		//Calcular el area de los Circulos de la lista
		
		for(Areable f : lista) {
			//Comprobar si f es un Circulo--> instanceof
			if(f instanceof Circulo) {
				((Circulo)f).calcularArea();
			}
		}
		
		//Calcular el área de todas las figuras
		for(Areable f : lista) {
			f.calcularArea();
		}	
		
		//Mostrar toda la info de las figuras almacenadas
		
		for(Areable f : lista) {
			System.out.println(f.toString());
		}
		
		
		
		
		
		
		
	}

}
