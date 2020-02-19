package metodos;

public class Ejemplos {

	//atributo de acceso:
	//public-->Método puede ser llamado desde cualquier clase
	//private-->Método sólo puede ser llamado dentro de la propia clase
	//protected-->Método sólo puede ser llamado desde clases derivadas.
	// por defecto --> Método puede ser llamado desde cualquier clase del mismo paquete
	
	static void e(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static int suma(int x,int y) {
		
		return x + y;
	}
	
	//Función con número de argumentos variables
	public static float suma(float... x1) {
		float suma = 0;
		
		for(int i = 0;i< x1.length;i++) {
			suma = suma + x1[i];
		}
		return suma;
	}
	
	public static int sumar10(int n) {
		n = n + 10;
		return n;
	}
	
	public static void resetearMatriz(int []m) {
		
		for(int i = 0;i<m.length;i++) {
			m[i] = 0;
		}	
		
		
	}
	
	
}
