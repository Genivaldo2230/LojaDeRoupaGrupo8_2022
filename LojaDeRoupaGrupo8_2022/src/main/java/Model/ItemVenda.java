/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class ItemVenda {
      
    private int id;
    private int idVenda;
    private int idProduto;
    private int qtde;
    private double valor;
    
    public ItemVenda(){
    }

    public ItemVenda(int _id, int _idVenda, int _idProduto, int _qtde,double _valor){
        this.id = _id;
        this.idVenda = _idVenda;
        this.idProduto = _idProduto;
        this.qtde = _qtde;
        this.valor = _valor;
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
