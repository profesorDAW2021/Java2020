package clasesDia4;

public class Vehiculo {

	private String matricula;
	private String marca;
	private String modelo;
	private float precio;
	private float velocidadMaxima;
	private float capacidad;
	public Vehiculo(String matricula, String marca, String modelo, float precio, float velocidadMaxima,
			float capacidad) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.velocidadMaxima = velocidadMaxima;
		this.capacidad = capacidad;
	}
	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public float getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ ", velocidadMaxima=" + velocidadMaxima + ", capacidad=" + capacidad + "]";
	}
	
	
	//Funnción que guarde un Vehiculo en la primera posicion vacía de 
	//una matriz de vehiculos
	
	public static void guardarVehiculo(Vehiculo []vs,Vehiculo v) {
		for(int i = 0;i<vs.length;i++) {
			if(vs[i]==null) {
				vs[i] = v;
				break;
			}
		}
	}
	
}
