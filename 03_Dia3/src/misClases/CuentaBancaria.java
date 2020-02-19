package misClases;

public class CuentaBancaria {
	
	public String numeroDeCuenta;
	public String dniTitular;
	public float saldo;
	public boolean recargo;
	
	//Constructores:
	//Se llaman igual que la clase
	//No tienen tipo de retorno
	//Suelen ser públicos
	//Constructor por defecto
	public CuentaBancaria() {
		saldo = 0;
		dniTitular = null;
		numeroDeCuenta = null;
		recargo = false;
	}
	
	public CuentaBancaria(String dni,String numeroDeCuenta) {
		this.dniTitular = dni;
		this.numeroDeCuenta = numeroDeCuenta;
		
	}
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return numeroDeCuenta + " " + dniTitular + " " + saldo + " " +recargo;
	}
	
}
