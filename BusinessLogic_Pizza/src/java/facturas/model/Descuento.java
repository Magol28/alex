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
public class Descuento {
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
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the percentage_desc
     */
    public float getPercentage_desc() {
        return percentage_desc;
    }

    /**
     * @param percentage_desc the percentage_desc to set
     */
    public void setPercentage_desc(float percentage_desc) {
        this.percentage_desc = percentage_desc;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    private int id;
    private Date date;
    private float percentage_desc;
    private String description;

    public Descuento(int id, Date date, float percentage_desc, String description) {
        this.id = id;
        this.date = date;
        this.percentage_desc = percentage_desc;
        this.description = description;
    }
}
