package herenciaRepaso;

public class Triangulo extends Figura {

	private float lado;
	private float altura;
	
	public Triangulo(float lado, float altura) {
		super("Triangulo equilátero");
		this.lado = lado;
		this.altura = altura;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	@Override
	
	public String toString() {
		return super.toString() + " lado: " + lado + " altura: " + altura;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		super.area = (lado*altura)/2;
	}
	
	
}
