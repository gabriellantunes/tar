package br.univille.poo.app.dbDAO;

import java.sql.Connection;

class BaseDAO {

    protected Connection getconection(){
        return conectclass.obterinstancia().getconection();
    }

}
