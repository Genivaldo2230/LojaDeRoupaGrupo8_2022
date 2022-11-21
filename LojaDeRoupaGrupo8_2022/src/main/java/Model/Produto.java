/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Produto {

    private int id;
    private int idCategoria;
    private String categoria;
    private String nome;
    private String descricao;
    private int qtde;
    private double valor;
    private boolean excluido;
    private String dataExclusao;
    private int usrId;

    public Produto() {
    }

    public Produto(int _id, int _idCategoria, String _categoria, String _nome, int _qtde, double _valor, boolean _excluido, String _dataExclusao, int _usrId,String _descricao) {

        this.id = _id;
        this.idCategoria = _idCategoria;
        this.categoria = _categoria;
        this.nome = _nome;
        this.qtde = _qtde;
        this.valor = _valor;
        this.descricao = _descricao;
        this.excluido = _excluido;
        this.dataExclusao = _dataExclusao;
        this.usrId = _usrId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public boolean isExcluido() {
        return excluido;
    }

    public void setExcluido(boolean excluido) {
        this.excluido = excluido;
    }

    public String getDataExclusao() {
        return dataExclusao;
    }

    public void setDataExclusao(String dataExclusao) {
        this.dataExclusao = dataExclusao;
    }

    public int getUsrId() {
        return usrId;
    }

    public void setUsrId(int usrId) {
        this.usrId = usrId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
