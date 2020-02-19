package clasesDia4;

public class Producto {

	//Atributos
	private String codigo; //AA99
	private String marca;
	private float precio;
	private static int contador;	
	
	//Constructores
	public Producto(String codigo) {
		setCodigo(codigo);
		contador++;
	}

	public Producto(String codigo, String marca, float precio) {
		
		setCodigo(codigo);
		this.marca = marca;
		this.precio = precio;
		contador++;
	}


	@Override
	public String toString() {
		return "codigo=" + codigo + ", marca=" + marca + ", precio=" + precio;
	}
	
	//Método aplicar descuento
	public void aplicarDescuento() {
		//Rebaja un 10% el precio
		precio-=precio*0.1;
	}
	
	public void aplicarDescuento(int porcentaje) {
		precio-=(precio*porcentaje)/100;
	}
	
	//Métodos de acceso al código
	public void setCodigo(String codigo) {
		if(codigo.length()==4) {
			if(Character.isLetter(codigo.charAt(0))&&Character.isLetter(codigo.charAt(1))&&
					Character.isDigit(codigo.charAt(2))&&Character.isDigit(codigo.charAt(3))) {
				this.codigo = codigo;
			}
		}
	} //Fin del método setCodigo
	
	public String getCodigo() {
		return this.codigo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		if(precio>=0) {
			this.precio = precio;
		}
		else {
			
		}
	}

	public static int getContador() {
		return contador;
	}
	
}
