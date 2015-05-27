package Vistas;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PerfilUsuario extends JPanel {
	
	private static PerfilEquipo panel2 = new PerfilEquipo();

	/**
	 * Create the panel.
	 */
	public PerfilUsuario() {
		
	JPanel panel = new JPanel();
	panel.setBounds(0, 0, 384, 362);
	panel.setLayout(null);
				
	/*//Icono
	Image logo = new ImageIcon(this.getClass().getResource("/logo.jpg")).getImage();
	JLabel icono = new JLabel("");
	icono.setBounds(25, 11, 167, 127);
	icono.setIcon(new ImageIcon(logo));
	add(icono);
		*/
	
	//Texto Nombre
	JTextField Nombre = new JTextField();
	Nombre.setEditable(false);
	Nombre.setBounds(201, 55, 86, 20);
	panel.add(Nombre);
	Nombre.setColumns(10);
				
	//Texto Apellidos
	JTextField Apellidos = new JTextField();
	Apellidos.setEditable(false);
	Apellidos.setBounds(201, 108, 86, 20);
	panel.add(Apellidos);
	Apellidos.setColumns(10);
				
	//Texto Edad
	JTextField Edad = new JTextField();
	Edad.setEditable(false);
	Edad.setBounds(201, 164, 86, 20);
	panel.add(Edad);
	Edad.setColumns(10);
				
	//Texto Nacionalidad
	JTextField Nacionalidad = new JTextField();
	Nacionalidad.setEditable(false);
	Nacionalidad.setBounds(201, 220, 86, 20);
	panel.add(Nacionalidad);
	Nacionalidad.setColumns(10);
				
	//Texto Id
	JTextField Id = new JTextField();
	Id.setEditable(false);
	Id.setBounds(315, 55, 47, 20);
	panel.add(Id);
	Id.setColumns(10);
				
	//Label nombre
	JLabel lblNombe = new JLabel("Nombre");
	lblNombe.setBounds(201, 33, 37, 14);
	panel.add(lblNombe);
				
	//Label apellidos
	JLabel lblApellidos = new JLabel("Apellidos");
	lblApellidos.setBounds(201, 86, 42, 14);
	panel.add(lblApellidos);
				
	//Label edad
	JLabel lblEdad = new JLabel("Edad\r\n");
	lblEdad.setBounds(201, 139, 24, 14);
	panel.add(lblEdad);
				
	//Label Nacionalidad
	JLabel lblNacionalidad = new JLabel("Nacionalidad");
	lblNacionalidad.setBounds(201, 195, 60, 14);
	panel.add(lblNacionalidad);
				
	//Label Id
	JLabel lblId = new JLabel("Id");
	lblId.setBounds(315, 33, 10, 14);
	panel.add(lblId);
				
	//Boton siguiente
	
	JButton Siguiente = new JButton("Siguiente >>");
	Siguiente.setBounds(267, 328, 95, 23);
	panel.add(Siguiente);
	Siguiente.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
				CardLayout c = (CardLayout)panel2.getLayout();
				c.show(getRootPane(),"segundoPanel");		
		}
	});
	
	}
	
}