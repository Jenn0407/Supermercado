package edu.iudigital.model;

/**
 * Clase que representa un producto
 */
public class Product {
    private final String name;
    private final double price;
    private final int quantity;

    /**
     * @param name
     * @param price
     * @param quantity
     */
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * @return Nombre del producto
     */
    public String getName() {
        return name;
    }

    /**
     * @return Precio del producto
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return Cantidad del producto
     */
    public int getQuantity() {
        return quantity;
    }
}
