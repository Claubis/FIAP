package ConectarBanco;

import java.sql.SQLException;

public class TestaBancoDados {
    public static void main(String[] args) throws SQLException {

        GerenciadorCliente gc = new GerenciadorCliente();


        System.out.println(gc.inserir(new Cliente(2, "Patizinha", "Naomi") )? "Cliente Adicionado" : "Cliente não Adicionado");


    }
}