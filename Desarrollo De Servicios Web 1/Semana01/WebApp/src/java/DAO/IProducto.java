/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import VO.ProductoVO;
import java.util.Collection;
/**
 *
 * @author Administrador
 */
public interface IProducto {
    public abstract  void insert(ProductoVO vo);
    public abstract  void update(ProductoVO vo);
    public abstract  void delete(Integer productoId);
    public abstract  void ProductoVO(Integer productoId);
    public abstract  Collection<ProductoVO> findAll();
}
