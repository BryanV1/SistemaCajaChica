/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FronEnd;

import java.io.Serializable;

/**
 *
 * @author Ricardo
 */
public class ClsUsuario extends ClsPersona implements Serializable{
    
    private String contrasenia;
    private String estado;
    
    public ClsUsuario(){
        super();
    }
    public ClsUsuario(int id ,String nombre,String apellido,String cedula,String contrasenia,String estado){
        super(id,nombre,apellido,cedula);
        this.contrasenia=contrasenia;
        this.estado=estado;
        
    } 

    /**
     * @return the contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * @param contrasenia the contrasenia to set
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
