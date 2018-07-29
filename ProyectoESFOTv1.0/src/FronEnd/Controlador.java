/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FronEnd;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Controlador {
    public void crearFichero(String nombreFichero){
        ObjectOutputStream oos;
        try{
            oos = new ObjectOutputStream(new FileOutputStream(nombreFichero));
            oos.close();  
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
    
    public void escribirObjeto(String nombreFichero, ArrayList<Object> elementos){
        System.out.println("Llega");
        try{
            ObjectOutputStream oos;
            oos = new ObjectOutputStream(new FileOutputStream(nombreFichero));
            for(int i = 0; i < elementos.size(); i++){
                Object elemento = new Object();
                elemento = elementos.get(i);
                //System.out.println(elemento.toString());
                oos.writeObject(elemento);
                System.out.println("escribe"+elemento.toString());
            }
            oos.close();
            
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println(ex);
        }
        
    }
    
    public ArrayList<Object> extraerObjetos(String nombreFichero){
        ArrayList<Object> elementos = new ArrayList<>();
        try{
            ObjectInputStream ois;
            ois = new ObjectInputStream(new FileInputStream(nombreFichero));
            
            Object aux = ois.readObject();
            while(aux!= null){
                elementos.add(aux);
                System.out.println("obtiene"+aux.toString());
                aux = ois.readObject();
            }
            ois.close();
            
        }catch(FileNotFoundException ex){
            crearFichero(nombreFichero);
        }catch(EOFException e1){
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return elementos;   
    } 
    
}
