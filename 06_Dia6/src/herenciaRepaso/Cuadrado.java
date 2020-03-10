package herenciaRepaso;

public class Cuadrado extends Figura {

	private float lado;
	
	public Cuadrado(float lado) {
		super("Cuadrado");
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	@Override	
	public String toString(){
		return super.toString() + " " + this.lado;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		super.area = lado*lado;
	}
	
	
}
