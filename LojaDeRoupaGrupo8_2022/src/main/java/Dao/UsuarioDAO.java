/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Usuario;
import java.util.ArrayList;

public class UsuarioDAO {

    public static boolean salvar(Usuario usuario) {
        boolean result = true;
        return result;
    }

    public static boolean atualizar(Usuario usuario) {
        boolean result = true;
        return result;
    }

    public static boolean excluir(int id) {
        boolean result = true;
        return result;
    }

    public static Usuario selecionarId(int id) {
        Usuario usuario = new Usuario();
        return usuario;
    }

    public static ArrayList<Usuario> selecionarLista() {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        return usuarios;
    }

}
