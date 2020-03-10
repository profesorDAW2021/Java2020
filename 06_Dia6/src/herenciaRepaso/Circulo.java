package herenciaRepaso;

public class Circulo extends Figura {
	
	private float radio;
	
	//Constructores 
	
	public Circulo(float radio) {
		super("Circulo");
		this.radio = radio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Radio : " + radio;
	}
	
	public void calcularArea() {
		super.area = (float)Math.PI*radio*radio;
	}
	
}
