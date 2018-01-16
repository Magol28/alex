/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturas.resources;

import com.google.gson.Gson;
import facturas.model.Descuento;
import facturas.model.Pizza;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
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
@Path("consulta")
public class ConsultaResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ConsultaResource
     */
    public ConsultaResource() {
    }

    /**
     * Retrieves representation of an instance of facturas.resources.ConsultaResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/price/{id}/{date}/user/{id_user}")
    public String getEstimatedPrize(@PathParam("id") String id,@PathParam("date") String date,@PathParam("id_user") String id_user) throws HttpException, IOException, URISyntaxException {
        //TODO return proper representation object
        Gson gson=new Gson();
        Descuento desc=new Descuento(0,new Date(0), 0, "");
        Pizza pizza=gson.fromJson(RestClient.doGet("http://54.212.247.249:8080/Proyecto_pizza/webresources/Pizza/"+id),Pizza.class);
        System.out.println(pizza.getCategoria());
        String json_desc=RestClient.doGet("http://54.212.247.249:8080/Proyecto_pizza/webresources/descuento/"+date);
        System.out.println(json_desc);
        if(json_desc.equals("a")){
            json_desc=RestClient.doGet("http://54.212.247.249:8080/Proyecto_pizza/webresources/descuento/bday/"+date+"/user/"+id_user);
            System.out.println(json_desc);
        }
        if(json_desc.equals("a")){
            System.out.println("ioyytr");
            return "{}";
        }
        desc=gson.fromJson(json_desc, Descuento.class);
        return "{\"Descuento\":{"
                + "\"porcentaje\":"+desc.getPercentage_desc()+","
                + "\"pizza\":\""+pizza.getNombre()+"\","
                + "\"valor_original\":"+pizza.getPrecio()+","
                + "\"valor_nuevo\":"+pizza.getPrecio()*(1-desc.getPercentage_desc())+""
                + "}}";
    }

    /**
     * PUT method for updating or creating an instance of ConsultaResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
