/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturas.model;

import java.util.ArrayList;

/**
 *
 * @author alexm
 */
public class Total_Pedido {
   private int id_pedido;
    private Persona persona;
    private float total_pedido;
    private float descuento;
    private ArrayList<Pizza> detalle_pedido;

    public Total_Pedido(int id_pedido, Persona persona, float total_pedido,float descuento, ArrayList<Pizza> detalle_pedido) {
        this.id_pedido = id_pedido;
        this.persona = persona;
        this.total_pedido = total_pedido;
        this.detalle_pedido = detalle_pedido;
        this.descuento=descuento;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    
    /**
     * @return the id_pedido
     */
    public int getId_pedido() {
        return id_pedido;
    }

    /**
     * @param id_pedido the id_pedido to set
     */
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    /**
     * @return the persona
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     * @return the total_pedido
     */
    public float getTotal_pedido() {
        return total_pedido;
    }

    /**
     * @param total_pedido the total_pedido to set
     */
    public void setTotal_pedido(float total_pedido) {
        this.total_pedido = total_pedido;
    }

    /**
     * @return the detalle_pedido
     */
    public ArrayList<Pizza> getDetalle_pedido() {
        return detalle_pedido;
    }

    /**
     * @param detalle_pedido the detalle_pedido to set
     */
    public void setDetalle_pedido(ArrayList<Pizza> detalle_pedido) {
        this.detalle_pedido = detalle_pedido;
    }
}
