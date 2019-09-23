package pizzapp.model;

import java.sql.SQLException;
import java.util.List;

public interface ClienteDAO {

    //criar
    void insere(Cliente c) throws SQLException;

    //recuperar
    Cliente buscaId(int id) throws SQLException;
    List<Cliente> lista() throws SQLException;

    //atualizar
    void atualizar(Cliente c) throws  SQLException;

    //remover
    void deletar(Cliente c) throws SQLException;

}
