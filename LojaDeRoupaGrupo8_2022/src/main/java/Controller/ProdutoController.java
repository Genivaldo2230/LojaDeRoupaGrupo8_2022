/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.ProdutoDAO;
import Model.Produto;
import java.util.ArrayList;

public class ProdutoController {

    public static boolean salvar(String nome, int qtde, double valor, int categoria,String descricao) {
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setQtde(qtde);
        produto.setValor(valor);
        produto.setIdCategoria(categoria);
        produto.setDescricao(descricao);

        return ProdutoDAO.salvar(produto);
    }

    public static boolean atualizar(int id,String nome, int qtde, double valor, int categoria,String descricao) {
        Produto produto = new Produto();
        produto.setId(id);
        produto.setNome(nome);
        produto.setValor(valor);
        produto.setIdCategoria(categoria);
        produto.setQtde(qtde);
        produto.setDescricao(descricao);
        return ProdutoDAO.atualizar(produto);

    }

    public static boolean excluir(int id) {
        return ProdutoDAO.excluir(id);
    }

    public static Produto selectId(int id) {
        return ProdutoDAO.selecionarId(id);
    }

    public static ArrayList<Produto> selectLista() {
        return ProdutoDAO.selecionarLista();
    }

}
