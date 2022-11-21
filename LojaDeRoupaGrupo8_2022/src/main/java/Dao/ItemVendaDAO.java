/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.ItemVenda;
import java.util.ArrayList;

public class ItemVendaDAO {

    public static boolean salvar(ItemVenda item) {
        boolean result = true;
        return result;
    }

    public static boolean atualizar(ItemVenda item) {
        boolean result = true;
        return result;
    }

    public static boolean excluir(int id) {
        boolean result = true;
        return result;
    }

    public static ItemVenda selecionarId(int id) {
        ItemVenda item = new ItemVenda();
        return item;
    }

    public static ArrayList<ItemVenda> selecionarLista() {
        ArrayList<ItemVenda> itens = new ArrayList<ItemVenda>();
        return itens;
    }

}
