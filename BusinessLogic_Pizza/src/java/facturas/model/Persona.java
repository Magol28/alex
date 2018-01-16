/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturas.model;

import java.sql.Date;

/**
 *
 * @author alexm
 */
public class Persona {
    private int ID;
    private String  Nombre;
    private String Apellido;
    private Date   Fecha_de_nacimiento;

    public Persona(int ID, String Nombre, String Apellido, Date Fecha_de_nacimiento) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Fecha_de_nacimiento = Fecha_de_nacimiento;
    }

    public Persona() {
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
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
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Fecha_de_nacimiento
     */
    public Date getFecha_de_nacimiento() {
        return Fecha_de_nacimiento;
    }

    /**
     * @param Fecha_de_nacimiento the Fecha_de_nacimiento to set
     */
    public void setFecha_de_nacimiento(Date Fecha_de_nacimiento) {
        this.Fecha_de_nacimiento = Fecha_de_nacimiento;
    }
}
