import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

public class AppGui extends JFrame {
	private static int ALTO=700,ANCHO=800;
	private JButton agregar;
	private JLabel lbNombre,lbEdad,lbApellido1,lbApellido2,lbSexo,lbNoControl,lbCarrera;
	private JTextField tfNombre,tfEdad,tfApellido1,tfApellido2,tfSexo,tfNoControl,tfCarrera;
	private ArrayList<String> num;
	private JComboBox lista;
	AgregarAlumno aa;
	
	 AppGui(){
		 aa = new AgregarAlumno();
		 
		this.setTitle("Mi Aplicacion de Alumnos con HashMap");
		this.setSize(ANCHO,ALTO);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		agregar = new JButton("Agregar Nuevo");
		agregar.setBounds(ANCHO/2,10,150,30);
		agregar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			aa.setVisible(true);
			}
		});
		tfNombre = new JTextField("");
		tfNombre.setBounds(100,100,150,30);
		tfNombre.enable(false);
		tfNombre.setFocusable(false);
		
		lbNombre = new JLabel("Nombre Alumno");
		lbNombre.setBounds(130,75,150,30);
		//-------------------------------------------------
		tfApellido1 = new JTextField("");
		tfApellido1.setBounds(300,100,150,30);
		tfApellido1.enable(false);
		tfApellido1.setFocusable(false);
		
		lbApellido1 = new JLabel("Apellido Paterno");
		lbApellido1.setBounds(330,75,150,30);
		//-------------------------------------------------
		tfApellido2 = new JTextField("");
		tfApellido2.setBounds(500,100,150,30);
		tfApellido2.enable(false);
		tfApellido2.setFocusable(false);
		
		lbApellido2 = new JLabel("Apellido Materno");
		lbApellido2.setBounds(530,75,150,30);
		//------------------------------------------------
		tfNoControl = new JTextField("");
		this.add(lbNombre);
		this.add(tfNombre);
		
		this.add(tfApellido1);
		this.add(lbApellido1);
		
		this.add(tfApellido2);
		this.add(lbApellido2);
		
		this.add(tfNoControl);
		this.add(lbNoControl);
		
		this.add(agregar);
		
				
	
	}	
	public static void main(String[] arg0){
		AppGui app=new AppGui();
		app.setVisible(true);
	}
	
}
