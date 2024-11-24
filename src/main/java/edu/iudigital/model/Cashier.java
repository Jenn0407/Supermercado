package edu.iudigital.model;


/**
 * Clase que representa un cajero
 */
public class Cashier {
    private final String name;

    /**
     * @param name
     */
    public Cashier(String name) {
        this.name = name;
    }

    /**
     * @return Nombre del cajero
     */
    public String getName() {
        return name;
    }

}
