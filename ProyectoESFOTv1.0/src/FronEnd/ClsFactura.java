/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FronEnd;

/**
 *
 * @author Bryan
 */
public class ClsFactura {
    
    
    private String id;
    private String fecha;
    private String ruta;
    private String proveedor;
    private double total;
    private String categoria;
    private int cantidad;
    private double precio;
    private String descripcion;

    public ClsFactura(String id,String fecha, String ruta, String proveedor, double total, String categoria, 
            int cantidad, double precio, String descripcion) {
        this.id = id;
        this.fecha=fecha;
        this.ruta=ruta;
        this.proveedor = proveedor;
        this.total = total;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }  

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "ClsFactura{" + "id=" + id + ", fecha=" + fecha + ", ruta=" + ruta + ", proveedor=" + proveedor + ", total=" + total + ", categoria=" + categoria + ", cantidad=" + cantidad + ", precio=" + precio + ", descripcion=" + descripcion + '}';
    }
    
    
            
    
}
