package ejemplosSeleccion;

public class EjemploIfelseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota = 4;
		//Suspenso si nota < 5 , aprobado si nota <7 , Sobresaliente en otro caso
		String calificacion = nota < 0 || nota > 10 ? "error" : nota < 5 ? "suspenso" : nota < 7 ? "Aprobado":"Sobresaliente";
		if(nota < 0 || nota > 10) {
			calificacion = "error";
		}
		else if(nota < 5) {
			calificacion = "Suspenso";
		}
		else if(nota < 7) {
			calificacion = "Aprobado";
		}
		else {
			calificacion = "Sobresaliente";
		}
	}

}
