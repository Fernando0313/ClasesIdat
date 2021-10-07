/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import VO.ProductoVO;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Administrador
 */
public class ProductoDAO implements IProducto{
    
    public static Map<Integer,ProductoVO> repository=new HashMap<>();
    static 
    {
        try{
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            ProductoVO producto1 = new ProductoVO(1,"Chocolates","Vicio",12.40,format.parse("2022-04-21"),120);
            ProductoVO producto2 = new ProductoVO(2,"Bonbones","Costa",11.40,format.parse("2022-02-11"),100);
            ProductoVO producto3 = new ProductoVO(3,"Flores","Rosatel",100.0,format.parse("2021-10-17"),200);
            ProductoVO producto4 = new ProductoVO(4,"Champane","Rose",33.10,format.parse("2025-12-24"),260);
            
            
            repository.put(producto1.getProductoId(),producto1);
            repository.put(producto2.getProductoId(),producto2);
            repository.put(producto3.getProductoId(),producto3);
            repository.put(producto4.getProductoId(),producto4);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }        
    
    
    
    
    
    @Override
    public void insert(VO.ProductoVO vo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(VO.ProductoVO vo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer productoId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ProductoVO(Integer productoId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<VO.ProductoVO> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
