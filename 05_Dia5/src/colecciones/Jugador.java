package colecciones;

public class Jugador {

	private String codigo;
	private String name;
	private int puntos;
	
	public Jugador() {
		
	}
	
	public Jugador(String codigo, String name, int puntos) {
		
		this.codigo = codigo;
		this.name = name;
		this.puntos = puntos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Jugador [codigo=" + codigo + ", name=" + name + ", puntos=" + puntos + "]";
	}
	
	
	
	
	
	
}
