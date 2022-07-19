package Principal;
import vistas.*;
import Modelo.*;






public class Main {

    
    public static void main(String[] args) {
        //1. Crear instancia1 de la  cla1se conexion
        Conexion conexion = new Conexion();
        conexion.getConnection();
        
        //2. Crear instancia del Jframe login
        Login login = new Login();
        login.setVisible(true); 
    }
    
}
