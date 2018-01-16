/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturas.resources;

import com.google.gson.Gson;
import facturas.model.Factura;
import facturas.model.Popular_Pizza;
import facturas.model.Total_Pedido;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import org.apache.http.HttpException;
import utils.RestClient;

/**
 * REST Web Service
 *
 * @author alexm
 */
@Path("factura")
public class FacturaResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FacturaResource
     */
    public FacturaResource() {
    }

    /**
     * Retrieves representation of an instance of facturas.resources.FacturaResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id_pedido}")
    public String getFactura(@PathParam("id_pedido") int id_pedido) {
        try {
            //TODO return proper representation object
            String json=RestClient.doGet("http://54.212.247.249:8080/Proyecto_pizza/webresources/Pedido/"+id_pedido);
            Gson gson=new Gson();
            Total_Pedido pedido=gson.fromJson(json, Total_Pedido.class);
            float iva=(float) (pedido.getTotal_pedido()*0.12);
            float total=(float) (pedido.getTotal_pedido()*1.12);
            Factura factura=new Factura(pedido, iva, total);
            return gson.toJson(factura);
        } catch (HttpException ex) {
            Logger.getLogger(FacturaResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FacturaResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(FacturaResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
	 /**
     * Retrieves representation of an instance of facturas.resources.FacturaResource
     * @return an instance of java.lang.String
     */
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/most_popular")
    public String getMostPopular() throws ClassNotFoundException, SQLException
    {
        Popular_Pizza el = null;
        Gson gson=new Gson();
        String productJson="holo"; 
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3309/avanzada","root","root");  
                            Statement stmt=(Statement) con.createStatement();
                ResultSet rs=stmt.executeQuery("SELECT `pedido_pizza`.`ID_PIZZA`,`pizza`.`NOMBRE`,SUM(`CANTIDAD`) FROM `pedido_pizza` INNER JOIN `pizza` ON `pedido_pizza`.`ID_PIZZA` = `pizza`.`ID_PIZZA`");
                while(rs.next())
                {
                    el = new Popular_Pizza(rs.getInt(1),rs.getString(2),rs.getInt(3));
                }
         productJson = gson.toJson(el);
         
        return productJson;
	}
    /**
     * PUT method for updating or creating an instance of FacturaResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putXml(String content) {
    }
}
