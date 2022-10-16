package br.univille.poo.app;

import br.univille.poo.app.entity.realizaTarefa;
import br.univille.poo.app.tasks.finaltarefa;
import br.univille.poo.app.tasks.createTarefa;
import br.univille.poo.app.tasks.mostraTarefa;

import java.util.Scanner;

public class Main {
    private static finaltarefa finaltarefa;
    public static void main(String[] args) {

        realizaTarefa realizaTarefa = new realizaTarefa();
        realizaTarefa.setdescr("Tarefa 2");

        realizaTarefa realizaTarefa2 = new realizaTarefa();
        realizaTarefa.setdescr("Tarefa 3");


        createTarefa createTarefa = new createTarefa();
        try {
            createTarefa.create(realizaTarefa);
        }catch (Exception e){
            e.printStackTrace();
        }

        mostraTarefa mostraTarefa = new mostraTarefa();
        for(realizaTarefa t : mostraTarefa.takeall()){
            System.out.println(t);
        }

        System.out.println("Tarefa em processo");
        mostraTarefa = new mostraTarefa();
        for(realizaTarefa t : mostraTarefa.takeall()){
            System.out.println(t);
        }
        Scanner teclado2 = new Scanner(System.in);
        Integer escolha = teclado2.nextInt();

        finaltarefa concluirTarefas = new finaltarefa();
    }
}

