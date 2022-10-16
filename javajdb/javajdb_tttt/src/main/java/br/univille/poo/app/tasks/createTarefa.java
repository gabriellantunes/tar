package br.univille.poo.app.tasks;

import br.univille.poo.app.entity.realizaTarefa;
import br.univille.poo.app.dbDAO.TaskDAO;

public class createTarefa {
    private TaskDAO dao;

    public createTarefa(){
        dao = new TaskDAO();
    }

    public void create(realizaTarefa realizaTarefa) throws Exception {
        if(realizaTarefa.getdescr() == null || realizaTarefa.getdescr().length() < 5){
            throw  new Exception("Adicionar Tarefa");
        }
        dao.inserir(realizaTarefa);
    }

}
