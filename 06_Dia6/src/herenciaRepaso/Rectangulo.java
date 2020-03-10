package herenciaRepaso;

public class Rectangulo extends Figura {

	private float ladoMenor;
	private float ladoMayor;
	
	
	public Rectangulo(float ladoMenor,float ladoMayor) {
		super("Rectangulo");
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
	}


	public float getLadoMenor() {
		return ladoMenor;
	}


	public void setLadoMenor(float ladoMenor) {
		this.ladoMenor = ladoMenor;
	}


	public float getLadoMayor() {
		return ladoMayor;
	}


	public void setLadoMayor(float ladoMayor) {
		this.ladoMayor = ladoMayor;
	}


	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		super.area = ladoMayor*ladoMenor;
	}
	
	
	
}
