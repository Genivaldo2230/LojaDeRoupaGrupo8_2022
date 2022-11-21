/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Categoria;
import java.util.ArrayList;

public class CategoriaDAO {

    public static boolean salvar(Categoria categoria) {
        boolean result = true;
        return result;
    }

    public static boolean atualizar(Categoria categoria) {
        boolean result = true;
        return result;
    }

    public static boolean excluir(int id) {
        boolean result = true;
        return result;
    }

    public static Categoria selecionarId(int id) {
        Categoria categoria = new Categoria();
        return categoria;
    }

    public static ArrayList<Categoria> selecionarLista() {
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        return categorias;
    }

}
