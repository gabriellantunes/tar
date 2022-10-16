package br.univille.poo.app.dbDAO;

import br.univille.poo.app.entity.realizaTarefa;
import br.univille.poo.app.tasks.interger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO extends BaseDAO{

    public void inserir(realizaTarefa realizaTarefa) {
        String sql = "insert into tarefa(descricao, concluido) values(? ,?)";
    }
    public List<realizaTarefa> obterTodos() {
        List<realizaTarefa> lista = new ArrayList<>();
        String sql = "select id, descricao, concluido from tarefa";
        return lista;
    }
    public void add(interger idTarefa) {
    }

    public void atualizar(Integer idTarefa) {
    }
}
