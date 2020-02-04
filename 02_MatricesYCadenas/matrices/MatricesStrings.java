package matrices;

public class MatricesStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombres[] = new String[5];
		String nombre;
		for(String valor : nombres) {
			System.out.println(valor);
		}
		//Guardar un String en la primera posición vacía de esta matriz
		
		for(int i = 0;i<nombres.length;i++) {
			if(nombres[i]==null) {
				nombres[i] = "Pepe";
				break;
			}
		}
		
		for(String valor : nombres) {
			System.out.println(valor);
		}
		
		
		
		
	}

}
