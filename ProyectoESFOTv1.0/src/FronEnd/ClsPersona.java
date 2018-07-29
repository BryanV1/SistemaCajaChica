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
public class ClsPersona implements Serializable{
    
    private int id;
    private String nombre;
    private String apellido;
    private String cedula;   
    //private String contrasenia;
    
    public ClsPersona(){
        
    }
    
    public ClsPersona(int id,String nombre,String apellido,String cedula){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;       
        //this.contrasenia=contrasenia;
        
         
    }
    @Override
    public String toString(){
        return this.id+" "+this.nombre+" "+this.apellido;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
