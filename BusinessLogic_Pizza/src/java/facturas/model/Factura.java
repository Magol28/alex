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
public class Factura {
    private Total_Pedido pedido;
    private float calculo_iva;
    private float precio_total_pagar;

    public Factura(Total_Pedido pedido, float calculo_iva, float precio_total_pagar) {
        this.pedido = pedido;
        this.calculo_iva = calculo_iva;
        this.precio_total_pagar = precio_total_pagar;
    }

    
    /**
     * @return the pedido
     */
    public Total_Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Total_Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the calculo_iva
     */
    public float getCalculo_iva() {
        return calculo_iva;
    }

    /**
     * @param calculo_iva the calculo_iva to set
     */
    public void setCalculo_iva(float calculo_iva) {
        this.calculo_iva = calculo_iva;
    }

    /**
     * @return the precio_total_pagar
     */
    public float getPrecio_total_pagar() {
        return precio_total_pagar;
    }

    /**
     * @param precio_total_pagar the precio_total_pagar to set
     */
    public void setPrecio_total_pagar(float precio_total_pagar) {
        this.precio_total_pagar = precio_total_pagar;
    }
    
}
