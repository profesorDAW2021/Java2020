
public class Ejemplo3_Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operadores :
			//Matemáticos: +,-,*,/ , %
		
			byte suma = 5 + 4;
			byte x = 2;
			int y=4;
			short suma2 = (short) (x + y);
			
			double division = (float)x/y;
			double division2 = x/9f;
			System.out.println(division);
			
			
			int num1 = 9,num2=4;
			double resultado = (double)num1/num2;
			System.out.println(resultado);		
			
			
			int matriz[] = {5,4,32,1};
			
			int sumaMatriz = 0;
			double media = 0;
			
			for(int i = 0;i<matriz.length;i++) {
				sumaMatriz+=matriz[i];
			}
			
			media = (double)sumaMatriz/matriz.length;
			
			//Operadores matematicos : += , -= ,*=,/=
			//Operadores incremento : ++
			//operaderor decremento : --
			
			int z= 9;
			int j = z++;
			System.out.println(j);
			System.out.println(z);
			int g = z++ + 1;
			System.out.println(g);
			System.out.println(z);
			
			z++;
			
			//Operadores relacionales: <,<=,>,>=,==,!=
			//Operadores lógicos: AND--> && , OR-->|| , Not --> !
			boolean condicion1 = g<20;
			boolean condicion2 = g<20 && g>10;
			
			
			
	}

}
