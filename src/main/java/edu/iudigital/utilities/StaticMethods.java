package edu.iudigital.utilities;

import edu.iudigital.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que contiene métodos de utilería
 */
public class StaticMethods {
    private StaticMethods() {
    }

    /**
     * Detiene el hilo actual por x segundo
     */
    public static void waitXSeconds(long secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * @param index Indice de la lista
     * @return Producto del supermercado
     */
    public static Product getProduct(int index) {
        List<Product> products = new ArrayList<Product>() {{
            add(new Product("Leche", 3200, 2));
            add(new Product("Canasta de Huevos", 15000, 2));
            add(new Product("Pan", 5000, 1));
            add(new Product("Arroba de Arroz", 50000, 1));
            add(new Product("Panela 8* unidades", 5000, 4));
        }};

        return products.get(index);
    }
}
