/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrador
 */
@WebService(serviceName = "wservices") //nombre del servicio web
public class wservices {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "welcome") //nombre de la operacion
    public String welcome(@WebParam(name = "curso") String curso) {
        
        String message = "Hello world with"+ curso;
        
        return message;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bienvenido")
    public String bienvenido(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        String messaje = "Bienvenido estimado "+nombre;
        return messaje;
    }
}
