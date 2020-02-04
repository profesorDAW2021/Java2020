package matrices;

public class Matrices2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]matriz2D = new int[2][8];
		
		int numeroFilas = matriz2D.length;
		int elementosFilaCero = matriz2D[0].length;
		int elementosFilaUno = matriz2D[1].length;
		
		System.out.println("Filas : " + numeroFilas);
		System.out.println("Columnas : " + elementosFilaCero);		
		
		//Recorrer la matriz
		
		for(int i = 0;i<2;i++) {
			for(int j = 0;j<8;j++) {
				System.out.print(matriz2D[i][j]+" ");
			}
			System.out.println();
		}
		
		//Recorrer la matriz con un for each
		System.out.println();
		for(int matriz[] : matriz2D) {
			for(int valor : matriz) {
				System.out.print(valor + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
				
		
	}

}
