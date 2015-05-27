package Vistas;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PerfilEquipo extends JPanel {

	/**
	 * Create the panel.
	 */
	private static Comprobacion panel3 = new Comprobacion();
	private static PerfilUsuario panel1 = new PerfilUsuario();
	
	public PerfilEquipo() {
	
	JPanel panel2 = new JPanel();
	panel2.setBackground(new Color(240, 240, 240));
	panel2.setBounds(0, 0, 384, 362);
	panel2.setLayout(null);
	
	//Texto Nombre
	JTextField Nombre = new JTextField();
	Nombre.setEditable(false);
	Nombre.setBounds(201, 55, 86, 20);
	panel2.add(Nombre);
	Nombre.setColumns(10);
	
	//Texto Apellidos
	JTextField Apellido = new JTextField();
	Apellido.setEditable(false);
	Apellido.setBounds(201, 108, 86, 20);
	panel2.add(Apellido);
	Apellido.setColumns(10);
	
	//Texto Apellidos
	JTextField Apellido2 = new JTextField();
	Apellido2.setEditable(false);
	Apellido2.setBounds(201, 164, 86, 20);
	panel2.add(Apellido2);
	Apellido2.setColumns(10);
	
	//Texto Nacionalidad
	JTextField Nacionalidad = new JTextField();
	Nacionalidad.setEditable(false);
	Nacionalidad.setBounds(201, 220, 86, 20);
	panel2.add(Nacionalidad);
	Nacionalidad.setColumns(10);
	
	//Texto Id
	JTextField Id = new JTextField();
	Id.setEditable(false);
	Id.setBounds(315, 55, 37, 20);
	panel2.add(Id);
	Id.setColumns(10);
	
	//Label nombre
	JLabel lblNombe = new JLabel("Nombre");
	lblNombe.setBounds(201, 33, 37, 14);
	panel2.add(lblNombe);
	
	//Label apellidos
	JLabel lblApellido = new JLabel("1º Apellido");
	lblApellido.setBounds(201, 86, 60, 14);
	panel2.add(lblApellido);
	
	//Label edad
	JLabel lblApellido2 = new JLabel("2\u00BA Apellido");
	lblApellido2.setBounds(201, 139, 60, 14);
	panel2.add(lblApellido2);
	
	//Label Nacionalidad
	JLabel lblNacionalidad = new JLabel("Nacionalidad");
	lblNacionalidad.setBounds(201, 195, 60, 14);
	panel2.add(lblNacionalidad);
	
	//Label Id
	JLabel lblId = new JLabel("Id");
	lblId.setBounds(315, 33, 10, 14);
	panel2.add(lblId);
	
	//Boton siguient
	
	JButton Siguiente = new JButton("Siguiente >>");
	Siguiente.setBounds(279, 328, 95, 23);
	panel2.add(Siguiente);
	Siguiente.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
				CardLayout c = (CardLayout)panel3.getLayout();
				c.show(getRootPane(),"tercerPanel");		
		}
	});
	
	//Boton Atra
	
	JButton atras = new JButton("<< Atrás");
	atras.setBounds(10, 328, 95, 23);
	panel2.add(atras);
	atras.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
				CardLayout c = (CardLayout)panel1.getLayout();
				c.show(getRootPane(),"tercerPanel");
		}
	});
	
	JComboBox comboBox = new JComboBox();
	comboBox.setBounds(10, 55, 127, 20);
	panel2.add(comboBox);
	
	JLabel lblEquipo = new JLabel("Equipo");
	lblEquipo.setBounds(10, 33, 37, 14);
	panel2.add(lblEquipo);
	}
	}
