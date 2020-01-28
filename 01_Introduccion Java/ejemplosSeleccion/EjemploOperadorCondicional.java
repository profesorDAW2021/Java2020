package ejemplosSeleccion;

public class EjemploOperadorCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Si nota <5 calificacion = suspenso sino aprobado
		int nota = 9;
		//Operador condicional: variable = condicion ? valor verdad : valor falso;
		
		String calificacion = nota<5 ? "Suspenso" : "Aprobado";
		
		/*if(nota<5) {
			calificacion = "Suspenso";
		}
		else {
			calificacion = "Aprobado";
		}
		*/
		
	}

}
