/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturas.model;

/**
 *
 * @author David
 */
public class Popular_Pizza 
{
    private int ID_pizza;
    private String Nombre;
    private String Categoria;
    private int cantidad;

    public Popular_Pizza(int ID_pizza, String Nombre, String Categoria, int cantidad) {
        this.ID_pizza = ID_pizza;
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.cantidad = cantidad;
    }
    public Popular_Pizza(int ID_pizza,String Nombre, int cantidad) {
        this.ID_pizza = ID_pizza;
        this.Nombre = Nombre;
        this.cantidad = cantidad;
    }
    
    /**
     * @return the ID_pizza
     */
    public int getID_pizza() {
        return ID_pizza;
    }

    /**
     * @param ID_pizza the ID_pizza to set
     */
    public void setID_pizza(int ID_pizza) {
        this.ID_pizza = ID_pizza;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Categoria
     */
    public String getCategoria() {
        return Categoria;
    }

    /**
     * @param Categoria the Categoria to set
     */
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
