
package Model;

public class Venda {
    
    private int id;
    private int idUsr;
    private double valorTotal;
    private String dataVenda;
    private int idCliente;
    private boolean excluido;
    private String dataExclusao;
    private int idUsrExclusao;
    
    public Venda(){
    }
    
    public Venda(int _id, int _idUsr, String _categoria, String _dataVenda, double _valorTotal, int _idCliente, boolean _excluido, String _dataExclusao, int _usrId) {

        this.id = _id;
        this.idUsr = _idUsr;
        this.valorTotal = _valorTotal;
        this.dataVenda = _dataVenda;
        this.idCliente = _idCliente;
        this.excluido = _excluido;
        this.dataExclusao = _dataExclusao;
        this.idUsrExclusao = _usrId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsr() {
        return idUsr;
    }

    public void setIdUsr(int idUsr) {
        this.idUsr = idUsr;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public int getIdUsrExclusao() {
        return idUsrExclusao;
    }

    public void setIdUsrExclusao(int idUsrExclusao) {
        this.idUsrExclusao = idUsrExclusao;
    }
    
}
