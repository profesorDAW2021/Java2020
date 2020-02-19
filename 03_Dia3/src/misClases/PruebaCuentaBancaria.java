package misClases;

import java.util.Scanner;

public class PruebaCuentaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear una cuenta bancaria
		
		String cadena= new String("Alexandre atiende!!!!");
		CuentaBancaria cB1 = new CuentaBancaria();
		CuentaBancaria cB2 = new CuentaBancaria("1234","we13241234");
		CuentaBancaria cB3 = new CuentaBancaria("1223344", "ES12341234");
		cB2.saldo  =300;
		cB2.numeroDeCuenta="Es34512341234";
		cB2.dniTitular = "90909090W";
				
		
		//Acceder a los datos de un objeto-->operador .
		cB1.saldo = 900;
		cB1.dniTitular = "12345678R";
		cB1.numeroDeCuenta="ES4509822339239292";
		cB1.recargo = false;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduzca el nuevo saldo");
		
		cB1.saldo = lector.nextFloat();
		lector.close();
		
		System.out.println(cB1.dniTitular + " " + cB1.saldo + " " + cB1.numeroDeCuenta);
		System.out.println("Hashcode: " + cB1.hashCode());
		System.out.println("ToString:" + cB1.toString());
		
		System.out.println("cB2: " + cB2.toString());
		
		
	}

}
