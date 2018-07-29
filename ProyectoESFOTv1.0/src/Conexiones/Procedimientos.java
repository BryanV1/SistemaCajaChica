package Conexiones;

import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.SQLException;
import javax.swing.JFileChooser;

public class Procedimientos {

    public static void EntradaUsuario(String a, String b, String c, String d/*,String e*/) throws SQLException {
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call INSERTARUSUARIO(?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);
        //entrada.setString(5, e);
        entrada.execute();
    }

    public static void ActualizarUsuario(String a, String b, String c, String d/*,String e*/) throws SQLException {
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call ACTUALIZARUSUARIO(?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);
        //entrada.setString(5, e);
        entrada.execute();
    }
    
    public static void IngresarFactura(String a, String b, String c, String d) throws SQLException {
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call INGRESARFACTURA1(?,?,?,?)}");        
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);        
        entrada.execute();
    }
    
    public static void ActualizarFactura(String a, String b, String c, String d) throws SQLException {
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call ACTUALIZARFACTURA(?,?,?,?)}");        
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);        
        entrada.execute();
    }
    
    
    
    public static void IngresarDetalleFactura(String a, String b, String c, String d,String e,String f) throws SQLException {
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call INGRESARDETALLEFACTURA(?,?,?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);
        entrada.setString(5, e);
        entrada.setString(6, f);
        entrada.execute();
    }
    
    public static void IngresarSolicitud(String a, String b, String c, String d,String e/*,String f*/) throws SQLException {
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call INGRESARSOLICITUD1(?,?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);
        entrada.setString(5, e);
        //entrada.setString(6, f);
        entrada.execute();
    }
    
    public static void IngresarVale(String a, String b, String c/*, String d,String e,String f*/) throws SQLException {
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call INGRESARVALE(?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        /*entrada.setString(4, d);
        entrada.setString(5, e);
        entrada.setString(6, f);*/
        entrada.execute();
    }
    
    public static void IngresarRetencion(String a, String b, String c/*, String d,String e,String f*/) throws SQLException {
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call INGRESARETENCION(?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);        
        entrada.execute();
    }
    
    public static void ActualizarMonto(String a, String b, String c, String d) throws SQLException {
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call ACTUALIZARMONTO(?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setString(4, d);
        entrada.execute();
    }
    
    public static void Reponer(String a, String b, String c) throws SQLException {
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call ACTUALIZARMONTO1(?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);        
        entrada.execute();
    }

    public static void EntradaUsuario(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
