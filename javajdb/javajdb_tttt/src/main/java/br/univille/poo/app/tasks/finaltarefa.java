package br.univille.poo.app.tasks;

import br.univille.poo.app.entity.realizaTarefa;
import br.univille.poo.app.dbDAO.TaskDAO;

public class finaltarefa {
    private TaskDAO dao;
    public finaltarefa(){
        dao = new TaskDAO();
    }


    public void finished(realizaTarefa realizaTarefa) throws Exception {if(realizaTarefa.getId() < 1){

            throw  new Exception("Id inválido");
        }
        if(realizaTarefa.finish()){
            throw  new Exception("A tarefa "+ realizaTarefa.getId()+" concluída.");
        }
        realizaTarefa.setconcluiu(true);
        dao.atualizar(realizaTarefa);
    }

    public void concluir(interger idtarefa) throws Exception {
        dao.add(idtarefa);
    }
    public void concluir(Integer idtarefa) throws Exception {
        dao.atualizar(idtarefa);
    }
}
