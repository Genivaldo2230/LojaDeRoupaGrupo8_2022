/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.ClienteDAO;
import Model.Cliente;
import java.util.ArrayList;

public class ClienteController {
    
    public static boolean salvar(String nome, String cpfCnpj)
    {
        Cliente cliente =  new Cliente();
        cliente.setNome(nome);
        cliente.setCpfCnpj(cpfCnpj);
        return ClienteDAO.salvar(cliente);
    }
    
    public static boolean atualizar(int id,String nome, String cpfCnpj)
    {
        Cliente cliente =  new Cliente();
        cliente.setId(id);
        cliente.setNome(nome);
        cliente.setCpfCnpj(cpfCnpj);
        return ClienteDAO.atualizar(cliente);
        
    }
    
    public static boolean excluir(int id)
    {
        return ClienteDAO.excluir(id);
    }
    
    public static Cliente selectId(int id)
    {
        return ClienteDAO.selecionarId(id);
    }
    
     public static ArrayList<Cliente> selectLista()
    {
        return ClienteDAO.selecionarLista();
    }


}
