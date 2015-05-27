package Main;

import Modelo.ConexionDB;
import Vistas.VistaPrincipal;

public class Lanzador {

	public static void main(String[] args) {
		ConexionDB nuevaConexion;
		
		nuevaConexion =new ConexionDB("localhost","thelaby","toni","");
		
		boolean conexion = ConexionDB.getInstance().connectDB();
		
		if(conexion==true){
			System.out.println("Conectado");
		}else{
			System.out.println("No conectado");
		}

		VistaPrincipal Vista= new VistaPrincipal();
		Vista.setVisible(true);
	}
}
	
