package matrices;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//Declaración matrices:
		int []matriz = new int[19];
		//matriz[19] = 90; --> Suelta una excepción
		//Accedemos por un índice
		
		matriz[0] = 21;
		matriz[1] = 90;
		
		//Declaración e inicialización de matriz
		
		float temperaturas[] = {2.3f,6.7f,9.5f,3.8f};
		
		//.length: Me indica el número de elementos que tiene una matriz
		int capacidad = temperaturas.length;
		
		//Mostrar por pantalla valores de una matriz
		System.out.println(matriz[0]);
		
		//Bucles para trabajar con matrices
		//for tradicional;
		System.out.println("Datos matriz:");
		for(int i = 0;i<matriz.length;i++) {
			System.out.print(matriz[i] + " ");
			
		}
		
		//Modificar las posiciones que tienen un cero , guardando un 1
		
		for(int i = 0;i<matriz.length;i++) {
			if(matriz[i]==0) {
				matriz[i] = 1;
			}
		}
		
		//Recorrer matriz de forma segura, para operaciones de lectura
		//for each
		//Calcular la suma de valores
		int suma = 0;
		for(int valor : matriz) {
			suma+=valor;
		}
		
		//Poner a positivo los valores negativos que hay en una matriz
		matriz[4] = -1;
//		for(int valor : matriz) {
//			if(valor < 0) {
//			    valor = Math.abs(valor);
//			}
//		}
		for(int i = 0;i<matriz.length;i++) {
			if(matriz[i]<0) {
				matriz[i] = Math.abs(matriz[i]);
			}
		}
		System.out.println();
		//Printo la matriz
		for(int valor : matriz) {
			System.out.print(valor + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
