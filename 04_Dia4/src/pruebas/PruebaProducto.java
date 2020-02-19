package pruebas;
import clasesDia4.Producto;
public class PruebaProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = new Producto("WE23");
		Producto p2 = new Producto("A878587612","HP",2500);
		Producto p3 = new Producto("WE34");
		
		//Mostrar por pantalla p2
		System.out.println(p2);
		
		//Aplicar descuentos
		p2.aplicarDescuento();
		p2.aplicarDescuento(20);
		
		p2.setCodigo("AW34");
		
		System.out.println(p2);
		
		//Comprobar si un código empieza por A
		
		if(p2.getCodigo().startsWith("A")) {
			p2.setPrecio(400);
		}
		
		System.out.println("Cuantos productos hay en memoria: " + Producto.getContador());
		
		
		
		
	}

}
