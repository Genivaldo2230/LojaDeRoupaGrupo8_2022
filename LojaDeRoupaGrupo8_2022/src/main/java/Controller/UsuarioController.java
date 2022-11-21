
package Controller;

import Dao.UsuarioDAO;
import Model.Usuario;
import java.util.ArrayList;

public class UsuarioController {
    
    
    public static boolean salvar(String nome, String cpfCnpj,int idCargo,String email,String senha,String dataNascimento)
    {
        Usuario user =  new Usuario();
        user.setNome(nome);
        user.setCpfCnpj(cpfCnpj);
        user.setIdCargo(idCargo);
        user.setEmail(email);
        user.setNome(nome);
        user.setSenha(senha);
        user.setDataNascimento(dataNascimento);
        return UsuarioDAO.salvar(user);
    }
    
    public static boolean atualizar(int id,String nome, String cpfCnpj,int idCargo,String email,String senha,String dataNascimento)
    {
        Usuario user =  new Usuario();
        user.setId(id);
        user.setNome(nome);
        user.setCpfCnpj(cpfCnpj);
        user.setIdCargo(idCargo);
        user.setEmail(email);
        user.setNome(nome);
        user.setSenha(senha);
        user.setDataNascimento(dataNascimento);
        return UsuarioDAO.atualizar(user);
        
    }
    
    public static boolean excluir(int id)
    {
        return UsuarioDAO.excluir(id);
    }
    
    public static Usuario selectId(int id)
    {
        return UsuarioDAO.selecionarId(id);
    }
    
     public static ArrayList<Usuario> selectLista()
    {
        return UsuarioDAO.selecionarLista();
    }

    
}
