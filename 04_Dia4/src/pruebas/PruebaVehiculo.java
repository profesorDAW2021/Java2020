package pruebas;
import clasesDia4.Vehiculo;
public class PruebaVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Matriz de Vehículos:
		Vehiculo concesionario[] = new Vehiculo[10];
		
		concesionario[0] = new Vehiculo("1234ASD");
		concesionario[1] = new Vehiculo("3456ERT");
		Vehiculo miVehiculo = new Vehiculo("2344DDD");
		Vehiculo.guardarVehiculo(concesionario, miVehiculo);
		
		Vehiculo.guardarVehiculo(concesionario, new Vehiculo("1234RRR"));
		//Algoritmo que establezca en 200 la velocidad máxima de todos los coches
		Vehiculo v1 = new Vehiculo("1234FGR");
		v1.setVelocidadMaxima(200);
		
		
		
		for(int i = 0;i<concesionario.length;i++) {
			if(concesionario[i]!=null) {
				concesionario[i].setVelocidadMaxima(200);
			}
		}
		
		//Mostrar toda la info del concesionario
		
		for(Vehiculo v: concesionario) {
			if(v!=null)
			System.out.println(v);
		}
		
	}

}
