package com.mycompany.yasuniexplora.objetos;

public class Devices extends Tour {

    private int code;
    private String description;
    private boolean status;

    public Devices(int code, String name) {
        super(code, name);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Devices{" + "code=" + code + ", description=" + description + ", status=" + status + '}';
    }

}
