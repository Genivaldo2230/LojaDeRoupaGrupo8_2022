/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Produto;
import java.util.ArrayList;

public class ProdutoDAO {

    public static boolean salvar(Produto produto) {
        boolean result = true;
        return result;
    }

    public static boolean atualizar(Produto produto) {
        boolean result = true;
        return result;
    }

    public static boolean excluir(int id) {
        boolean result = true;
        return result;
    }

    public static Produto selecionarId(int id) {
        Produto produto = new Produto();
        return produto;
    }

    public static ArrayList<Produto> selecionarLista() {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        return produtos;
    }

}
