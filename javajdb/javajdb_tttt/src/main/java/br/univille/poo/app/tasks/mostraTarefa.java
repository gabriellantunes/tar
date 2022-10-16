package br.univille.poo.app.tasks;

import br.univille.poo.app.entity.realizaTarefa;
import br.univille.poo.app.dbDAO.TaskDAO;

import java.util.List;

public class mostraTarefa {
    private TaskDAO dao;
    public mostraTarefa(){
        dao = new TaskDAO();
    }
    public List<realizaTarefa> takeall(){
        return dao.obterTodos();
    }

}
