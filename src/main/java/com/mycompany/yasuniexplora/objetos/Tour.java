package com.mycompany.yasuniexplora.objetos;

public class Tour {

    private int code;
    private String name;
    private float difficulty = 1.0f;

    public Tour(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(float difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Tour{" + "code=" + code + ", name=" + name + ", difficulty=" + difficulty + '}';
    }

    

}
