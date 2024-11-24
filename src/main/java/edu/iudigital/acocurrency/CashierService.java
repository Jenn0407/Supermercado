package edu.iudigital.acocurrency;

import edu.iudigital.model.Cashier;
import edu.iudigital.model.Client;
import edu.iudigital.model.Product;
import edu.iudigital.utilities.StaticMethods;

/**
 * Servicio de Cajero que contiene las funciones del cajero
 */
public class CashierService {
    private final Cashier cashier;

    public CashierService(Cashier cashier) {
        this.cashier = cashier;
    }

    /**
     * @param client    El cliente que compra los productos
     * @param timeStamp Tiempo inicial de compra
     */
    public void chargeCustomer(Client client, long timeStamp) {
        double total = 0;
        System.out.println("---------- " + cashier.getName() + " inicia procesando productos del cliente " + client.getName() + " ----------"
                + "\n" + "Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos");
        for (Product product : client.getShoppingCar()) {
            StaticMethods.waitXSeconds(1);
            total += product.getPrice() * product.getQuantity();
            System.out.println("Nombre: " + product.getName()
                    + "\n" + "Precio: " + product.getPrice()
                    + "  Cantidad: " + product.getQuantity()
                    + "\n" + "Producto de " + client.getName() + " procesado por " + cashier.getName());
        }
        System.out.println("Total a pagar por " + client.getName() + ": " + total);
        System.out.println("Tiempo total de compra: " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos");
    }
}
