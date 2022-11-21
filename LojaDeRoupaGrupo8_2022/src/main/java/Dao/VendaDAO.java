/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Venda;
import java.util.ArrayList;

public class VendaDAO {

    public static boolean salvar(Venda venda) {
        boolean result = true;
        return result;
    }

    public static boolean atualizar(Venda venda) {
        boolean result = true;
        return result;
    }

    public static boolean excluir(int id) {
        boolean result = true;
        return result;
    }

    public static Venda selecionarId(int id) {
        Venda venda = new Venda();
        return venda;
    }

    public static ArrayList<Venda> selecionarLista() {
        ArrayList<Venda> vendas = new ArrayList<Venda>();
        return vendas;
    }

}
