package herenciaRepaso;

public abstract class Figura implements Areable {

	private float perimetro;
	protected float area;
	private String nombre;
	
    public Figura() {
		
	}
	
	public Figura(String nombre) {
		this.nombre = nombre;
	}
	
	public float getPerimetro() {
		return perimetro;
	}
	
	public float getArea() {
		return area;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public String toString() {
		return "Figura: " + nombre + " Area: " + area + " Perimetro: " + perimetro;
	}
	
	//Método abstracto calcularArea
	
	
	
	
	
	
	
	
	
	
}
