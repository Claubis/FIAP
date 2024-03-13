package ConectarBanco;

import oracle.jdbc.pool.OracleDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;


/**
 * Driver: JDBC - Java Database Connectivity
 * Execução de instruções SQL (Qualquer banco de dados relacional)
 * Pacote java.sql (biblioteca java)
 * Classe DriverManager
 * Interface - Driver, Connection, Statement, Prepared Statement, Result Set
 * @author logonrmlocal
 *
 */

public class GerenciadorCliente {
	private String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
    private Connection conn;


    public GerenciadorCliente() throws SQLException {
        OracleDataSource ods = new OracleDataSource();

        //Configurando a URL
        ods.setURL(url);

        //Configurando o usuário
        ods.setUser(Credenciais.user);

        //Configurando a senha
        ods.setPassword(Credenciais.pwd);

        //Obtendo uma conexão
        conn = ods.getConnection();

    }
    
    //método excluir()
    public boolean excluir(int id) {
    String sql = "DELETE FROM cliente WHERE id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            // é a posição do "?"
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao remover o cliente");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    //método atualizar()
    public void atualizar(Cliente cliente) {
        String sql = "UPDATE cliente SET nome = ?, sobrenome = ? WHERE id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getSobrenome());
            ps.setInt(3, cliente.getId());
            ps.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar o Cliente - atualizar()");
            e.printStackTrace();
        }
    }

    //método inserir(Cliente)
    public boolean inserir(Cliente c) {
                                // é aqui onde eu coloco o nome da tabela
        String sql = "INSERT INTO cliente VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, c.getId());
            ps.setString(2, c.getNome());
            ps.setString(3, c.getSobrenome());
            ps.execute();

        } catch (SQLException e) {
            if (conn == null) {
                System.err.println("Conexão nula");
            }
            e.printStackTrace();
            return false;
        } finally {
                try {
                    System.out.println("Fechando a conexão com o BD");
                    conn.close(); //fechando a conexão
                } catch (SQLException e) {
                    System.err.println("Erro ao fechar a conexão!");
                    e.printStackTrace();
                }
            }
        //retorna
        return true;
        }
    
    // Método de consulta e inserir na lista
    public List<Cliente> Listar(){
    	List<Cliente> clintes = new ArrayList<Cliente>();
    	String sql = "SELECT * FROM CLIENTE";
    	
    	try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt(0);
				String nome = rs.getString(1);
				String sobrenome = rs.getString("sobrenome");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
      


}
