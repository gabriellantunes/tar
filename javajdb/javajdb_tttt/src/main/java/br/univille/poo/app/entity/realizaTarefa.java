package br.univille.poo.app.entity;

public class realizaTarefa {

    private int id;
    private String descr;
    private boolean finished;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getdescr() {
        return descr;
    }
    public void setdescr(String descr) {
        this.descr = descr;
    }
    public boolean finish() {
        return finished;
    }
    public void setconcluiu(boolean finished) {
        this.finished = finished;
    }
    }
