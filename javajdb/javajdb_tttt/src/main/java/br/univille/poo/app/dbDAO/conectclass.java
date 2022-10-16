package br.univille.poo.app.dbDAO;

import java.sql.Connection;
import java.sql.DriverManager;

class conectclass {

    private static conectclass instancia;

    private conectclass(){}

    public static conectclass obterinstancia(){
        if(instancia == null){
            instancia = new conectclass();
        }
        return instancia;
    }
}
