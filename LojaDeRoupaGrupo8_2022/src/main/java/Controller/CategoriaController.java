/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Categoria;
import Dao.CategoriaDAO;
import java.util.ArrayList;

public class CategoriaController {
    
     public static boolean salvar(String categoria)
    {
        Categoria cat =  new Categoria();
        cat.setCategoria(categoria);
        return CategoriaDAO.salvar(cat);
    }
    
    public static boolean atualizar(int id,String categoria)
    {
        Categoria cat =  new Categoria();
        cat.setId(id);
        cat.setCategoria(categoria);
        return CategoriaDAO.atualizar(cat);
        
    }
    
    public static boolean excluir(int id)
    {
        return CategoriaDAO.excluir(id);
    }
    
    public static Categoria selectId(int id)
    {
        return CategoriaDAO.selecionarId(id);
    }
    
     public static ArrayList<Categoria> selectLista()
    {
        return CategoriaDAO.selecionarLista();
    }
    
}
