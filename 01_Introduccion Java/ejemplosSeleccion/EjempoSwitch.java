package ejemplosSeleccion;

public class EjempoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char opcion='a';
		
		switch(opcion) {
		
		case 'a':
		case 'A':
			System.out.println("Opción a: ");
			break;
		case 'b':
			System.out.println("Opción b: ");
			break;
		default:
			System.out.println("Otra opcion");
			break;
		}
		
	}

}
