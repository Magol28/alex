/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturas.model;

/**
 *
 * @author alexm
 */
public class Pizza {
    private int ID_pizza;
    private String Nombre;
    private String Categoria;
    private float precio;
    private int cantidad;
    public Pizza() {
    }

    public Pizza(int ID_pizza, String Nombre, String Categoria, float precio) {
        this.ID_pizza = ID_pizza;
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.precio = precio;
    }

    public Pizza(int ID_pizza, String Nombre, String Categoria, float precio, int cantidad) {
        this.ID_pizza = ID_pizza;
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.precio = precio;
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
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
