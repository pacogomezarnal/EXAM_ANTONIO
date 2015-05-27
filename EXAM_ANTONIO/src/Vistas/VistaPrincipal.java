package Vistas;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Iterator;

import javax.swing.JPasswordField;

import Modelo.Cadete;
import java.awt.CardLayout;

public class VistaPrincipal extends JFrame {
	
	public PerfilUsuario PerfilUsuario;
	public PerfilEquipo PerfilEquipo;
	public Comprobacion Comprobacion;
	

	public VistaPrincipal() {
		
		//Titulo
		setTitle("THE LABY");
		setBackground(Color.LIGHT_GRAY);
		this.setBounds(0,0,400,400);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelPrincipal = new PerfilUsuario();
		JPanel segundoPanel= new PerfilEquipo();
		JPanel tercerPanel= new Comprobacion();
		
		//Panel
		JPanel panel = new JPanel();
		getContentPane().add(panelPrincipal, "panelPrincipal");
		panel.setLayout(new CardLayout(0, 0));
		
		//Pane2
		JPanel panel2 = new JPanel();
		getContentPane().add(segundoPanel, "segundoPanel");
		panel2.setLayout(new CardLayout(0, 0));
				
		//Pane3
		JPanel panel3 = new JPanel();
		getContentPane().add(tercerPanel, "tercerPanel");
		panel.setLayout(new CardLayout(0, 0));
	}
}
