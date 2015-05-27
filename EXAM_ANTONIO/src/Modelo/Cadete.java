package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//Clase que almacenará todos los datos de un cadete
public class Cadete {
	//Propiedades
	private int id=0;
	private String nombre="";
	private String apellidos="";
	private int edad=0; 
	private String nacionalidad="";
	private int equipo=0; 
	
	//Atributos para manejar la conexion
	private Connection conexion=null;//conexion
	private Statement instruccion = null;//Sentencias sql
	private ResultSet resultados = null;//devuelve datos
	
	private static String DATOS = "SELECT * FROM cadetes";
	private static String EQUIPO = "SELECT * FROM cadetes WHERE equipo=1";
	
	
	//Constructores
	public Cadete() {
		//Establezco la conexion
		this.conexion=ConexionDB.getConexion();
	}
	
	public Cadete(int id,
				  String nombre,
				  String apellidos,
				  int edad,
				  String nacionalidad,
				  int equipo) {
		this.id=id;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.nacionalidad=nacionalidad;
		this.equipo=equipo;
		
	}
	
	public ArrayList<String> getDatosCadete(){
		//Creo un arraylist para almacenar los datos que recibo de la consulta mysql
		ArrayList<String> datosCadete=new ArrayList<String>();
		try{
			//Creo un canal para conectarme a la BD
			this.instruccion = this.conexion.createStatement();
			this.resultados = instruccion.executeQuery(DATOS);
					
			//Recorro los resultados y los almacenamos en un ArrayList			
			while( resultados.next()){
				//Me devuelve los resultados del select y le extraigo la columna que yo quiero
				datosCadete.add(resultados.getString("id"));
				datosCadete.add(resultados.getString("nombre"));
				datosCadete.add(resultados.getString("apellidos"));
				datosCadete.add(resultados.getString("edad"));
				datosCadete.add(resultados.getString("nacionalidad"));
				datosCadete.add(resultados.getString("equipo"));
				
			}
		}catch( SQLException excepcionSql ) {
			excepcionSql.printStackTrace();
		}finally{
			try{
				resultados.close();
				instruccion.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}
		return datosCadete;
	}
	
	public ArrayList<String> CadetesEquipo1(){
		//Creo un arraylist para almacenar los datos que recibo de la consulta mysql
		ArrayList<String> datosCadeteEquipo=new ArrayList<String>();
		try{
			//Creo un canal para conectarme a la BD
			this.instruccion = this.conexion.createStatement();
			this.resultados = instruccion.executeQuery(EQUIPO);
					
			//Recorro los resultados y los almacenamos en un ArrayList			
			while(resultados.next()){
				//Me devuelve los resultados del select y le extraigo la columna que yo quiero
				datosCadeteEquipo.add(resultados.getString("id"));
				datosCadeteEquipo.add(resultados.getString("nombre"));
				datosCadeteEquipo.add(resultados.getString("apellidos"));
				datosCadeteEquipo.add(resultados.getString("edad"));
				datosCadeteEquipo.add(resultados.getString("nacionalidad"));
				datosCadeteEquipo.add(resultados.getString("equipo"));
				
			}
		}catch( SQLException excepcionSql ) {
			excepcionSql.printStackTrace();
		}finally{
			try{
				resultados.close();
				instruccion.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}
		return datosCadeteEquipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEquipo() {
		return equipo;
	}

	public void setEquipo(int equipo) {
		this.equipo = equipo;
	}

}
