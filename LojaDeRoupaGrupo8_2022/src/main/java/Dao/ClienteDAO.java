package Dao;

import Model.Cliente;
import java.util.ArrayList;

public class ClienteDAO {

    public static boolean salvar(Cliente cliente) {
        boolean result = true;
        return result;
    }

    public static boolean atualizar(Cliente cliente) {
        boolean result = true;
        return result;
    }

    public static boolean excluir(int id) {
        boolean result = true;
        return result;
    }

    public static Cliente selecionarId(int id) {
        Cliente cliente = new Cliente();
        return cliente;
    }

    public static ArrayList<Cliente> selecionarLista() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        return clientes;
    }

}
