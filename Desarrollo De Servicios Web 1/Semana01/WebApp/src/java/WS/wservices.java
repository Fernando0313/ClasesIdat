/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import DAO.IProducto;
import DAO.ProductoDAO;
import VO.ProductoVO;
import java.util.Collection;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Administrador
 */
@WebService(serviceName = "wservices")
public class wservices {
    private IProducto productoDao = new ProductoDAO();
    
    
    @WebMethod(operationName = "welcome") //nombre de la operacion
    public String welcome(@WebParam(name = "curso") String curso) {
        
        String message = "Hello world with"+ curso;
        
        return message;
    }
    
    @WebMethod(operationName = "producto_listar")
    public  Collection<ProductoVO> producto_listar(){
        return productoDao.findAll();
    }
    
    @WebMethod(operationName = "producto_registrar")
    public void producto_registrar(ProductoVO vo){
        productoDao.insert(vo);
    }
    
}
