package Vistas;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Comprobacion extends JPanel {
	private JTextField Id;
	private JTextField textField;
	private JTextField textField_1;
	PerfilEquipo panel2 = new PerfilEquipo();

	/**
	 * Create the panel.
	 */
	public Comprobacion() {
		
	JPanel panel3 = new JPanel();
	panel3.setBackground(new Color(240, 240, 240));
	panel3.setBounds(0, 0, 384, 362);
	panel3.setLayout(null);
	
	JLabel lblId = new JLabel("Id");
	lblId.setBounds(10, 24, 37, 14);
	panel3.add(lblId);
	
	Id = new JTextField();
	Id.setColumns(10);
	Id.setBounds(10, 49, 46, 20);
	panel3.add(Id);
	
	JLabel Apellido = new JLabel("1er Apellido");
	Apellido.setBounds(92, 24, 86, 14);
	panel3.add(Apellido);
	
	textField = new JTextField();
	textField.setColumns(10);
	textField.setBounds(92, 49, 86, 20);
	panel3.add(textField);
	
	JButton button = new JButton("COMPROBAR");
	button.setBounds(63, 141, 258, 23);
	panel3.add(button);
	
	//Boton atras
	
	JButton atras = new JButton("<< Atrás");
	atras.setBounds(10, 328, 95, 23);
	panel3.add(atras);
	atras.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
				CardLayout c = (CardLayout)panel2.getLayout();
				c.show(getRootPane(),"tercerPanel");
		}
	});
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(63, 187, 258, 20);
	panel3.add(textField_1);
	}

}
