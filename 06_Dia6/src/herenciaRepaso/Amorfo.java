package herenciaRepaso;

public class Amorfo implements Areable {

	private float area;
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.area = (float)(Math.random()+ 1)*10;
	}

	
}
