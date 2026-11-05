package com.mycompany.yasuniexplora.objetos;

public class SeveralTrial {

    private String name;
    private float lenght;
    private float estimatedWalking;

    public SeveralTrial(String name, float lenght, float estimatedWalking) {
        this.name = name;
        this.lenght = lenght;
        this.estimatedWalking = estimatedWalking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public float getEstimatedWalking() {
        return estimatedWalking;
    }

    public void setEstimatedWalking(float estimatedWalking) {
        this.estimatedWalking = estimatedWalking;
    }

    @Override
    public String toString() {
        return "SeveralTrial{" + "name=" + name + ", lenght=" + lenght + ", estimatedWalking=" + estimatedWalking + '}';
    }

}
