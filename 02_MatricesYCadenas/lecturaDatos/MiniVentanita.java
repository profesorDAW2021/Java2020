
package lecturaDatos;
import javax.swing.*;
public class MiniVentanita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       float mensualidad;
        
       mensualidad = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce el coste de la mensualidad"));
        
       System.out.println("El curso cuesta : " + mensualidad + " euros");
       
	}

}
