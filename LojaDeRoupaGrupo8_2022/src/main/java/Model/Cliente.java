package Model;

public class Cliente {

    private int id;
    private String nome;
    private String cpfCnpj;
    private String email;
    private String telefone;
    private String sexo;
    private String estadoCivil;
    private String dataNascimento; 
    private boolean excluido;
    private String dataExclusao;
    private int usrId;

    public Cliente() {

    }

    public Cliente(int _id, String _nome, String _cpfCnpj, boolean _excluido, String _dataExclusao, int _usrId) {
        this.id = _id;
        this.nome = _nome;
        this.cpfCnpj = _cpfCnpj;
        this.excluido = _excluido;
        this.dataExclusao = _dataExclusao;
        this.usrId = _usrId;
    }

    public Cliente(String pNome, String pCPF) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
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
