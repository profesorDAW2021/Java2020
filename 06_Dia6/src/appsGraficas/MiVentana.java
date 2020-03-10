package appsGraficas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MiVentana extends JFrame {
	
	//Definicion de controles de la ventana
	private JButton btn1,btnSumar;
	private JTextField txtNombre;
	
	
	public MiVentana() {
		//Titulo
		this.setTitle("Viva el coronavirus");
		//Establecer un tamaño
		this.setSize(500, 300);
		//Establecer el objeto layout
		this.setLayout(new FlowLayout());
		
		//Inicializar los componentes
		this.btn1 = new JButton("Pulsar!");
		this.txtNombre = new JTextField(30);
		this.btnSumar = new JButton("Sumar 10");
		
		//Añadirlos al panel de contenidos
		this.getContentPane().add(btn1);
		add(txtNombre);
		add(btnSumar);
		
		//Configurar botón de cierre para que salga de la aplicación
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Asociamos al botón un escuchador de evento click
		this.btn1.addActionListener(new EscuchadorClicks());
		this.btnSumar.addActionListener(new EscuchadorSuma());
		
		
		//Hacer visible la ventana
		this.setVisible(true);		
	}
	
	class EscuchadorClicks implements ActionListener{
		private int contador;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(contador==0){
				txtNombre.setBackground(Color.green);
				contador++;
			}
			else {
				contador = 0;
				txtNombre.setBackground(Color.gray);
			}
			
		}	
		
	}
	
	class EscuchadorSuma implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//Recoger lo que hay en la caja d etexto
			
			String valor = txtNombre.getText();
			int valorNumerico = Integer.parseInt(valor);
			valorNumerico+=25;
			txtNombre.setText(Integer.toString(valorNumerico));
			
		}
		
	}
	
	
	
	

}
