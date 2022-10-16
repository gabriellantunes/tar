package br.univille.poo.app.dbDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class createTable {

    private final static String CREATE_TABLE_TASK = "create table if not exists tarefa(" +
            "                id integer primary key autoincrement" +
            "               ,descricao  varchar(200)" +
            "               ,concluido  boolean" +
            "            )";

    public static void createtable(){
        List<String> lista = new ArrayList<>();
        lista.add(CREATE_TABLE_TASK);
        }

}
