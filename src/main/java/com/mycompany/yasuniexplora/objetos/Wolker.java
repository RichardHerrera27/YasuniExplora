package com.mycompany.yasuniexplora.objetos;

public class Wolker extends Tour {

    private int identified;
    private String name;
    private boolean status;

    public Wolker(int code, String name) {
        super(code, name);
    }

    public int getIdentified() {
        return identified;
    }

    public void setIdentified(int identified) {
        this.identified = identified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
