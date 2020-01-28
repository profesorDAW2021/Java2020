
public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("Hola Mundo!!!");
		System.out.println("Otra linea");
		
		//Tipos de variables
		//Primitivas
			//Numéricas enteras: byte , short , int , long
			//byte -128 a 127
		
			//Numéricas con decimales: float , double
			//1 caracter: char
			//booleanas: boolean
		
		//Declaración de variables:
		
			int edad; //No se inicializan por defecto
			long saldo = 129; //Declaración e inicialización
			
		//error-->	System.out.println(edad);
			
			long valor1,valor2,valor3;
			long valor4 = 9,valor5=8,valor6=1;
			
			
			//Mostrar por pantalla una variable
			System.out.println(valor5);
		
			
			System.out.println("La variable valor5 = " + valor5);
		
		//Complejas o Objetos
			String mensaje = "Bienvenidos al curso de 140€ de Java";
			
			
			char primeraLetra = mensaje.charAt(0);
			
			System.out.println(primeraLetra);
		
	}

}
