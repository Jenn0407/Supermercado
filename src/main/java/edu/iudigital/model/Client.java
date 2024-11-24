package edu.iudigital.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa la entidad cliente
 */
public class Client {
    /**
     * Atributo que determina el nombre del cliente
     */
    private final String name;
    /**
     * Carrito de compras con los productos
     */
    private final List<Product> shoppingCar;


    /**
     * @param name Nombre del cliente
     */
    public Client(String name) {
        this.name = name;
        shoppingCar = new ArrayList<Product>();
    }

    /**
     * @param product Producto a agregar a la lista
     */
    public void addProduct(Product product) {
        shoppingCar.add(product);
    }

    /**
     * @return Lista de productos del carrito
     */
    public List<Product> getShoppingCar() {
        return shoppingCar;
    }

    /**
     * @return Nombre del cliente
     */
    public String getName() {
        return name;
    }
}
