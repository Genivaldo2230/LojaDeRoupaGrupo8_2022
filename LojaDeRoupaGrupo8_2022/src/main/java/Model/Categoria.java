/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Categoria {

    private int id;
    private String categoria;
    private String descricao;
    private boolean excluido;
    private String dataExclusao;
    private int usrId;

    public Categoria() {
    }

    public Categoria(int _id, String _categoria, String _descricao, boolean _excluido, String _dataExclusao, int _usrId) {
        this.id = _id;
        this.categoria = _categoria;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

}
