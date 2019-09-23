package pizzapp.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {


    @Override
    public void insere(Cliente c) throws SQLException {

        Connection con = FabricaConexao.getConnection();

    }

    @Override
    public Cliente buscaId(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Cliente> lista() throws SQLException {
        return null;
    }

    @Override
    public void atualizar(Cliente c) throws SQLException {

    }

    @Override
    public void deletar(Cliente c) throws SQLException {

    }
}
