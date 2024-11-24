package edu.iudigital.concurrent;

import edu.iudigital.model.Cashier;
import edu.iudigital.model.Client;
import edu.iudigital.model.Product;
import edu.iudigital.utilities.StaticMethods;

/**
 * Servicio Concurrente de Cajero, que contiene las funciones del cajero
 */
public class ConcurrentCashierService extends Thread {
    private final Cashier cashier;
    private Client client;
    private long timeStamp;

    /**
     * @param cashier Cajero que cobra al cliente
     */
    public ConcurrentCashierService(Cashier cashier) {
        this.cashier = cashier;
    }

    /**
     * @param client    El cliente que compra los productos
     * @param timeStamp Tiempo inicial de compra
     */
    public void chargeCustomer(Client client, long timeStamp) {
        this.client = client;
        this.timeStamp = timeStamp;
        this.start();
    }

    /**
     * Método sobreescrito para cobrar al cliente que permite la concurrencia
     */
    @Override
    public void run() {
        double total = 0;
        System.out.println("---------- " + cashier.getName() + " inicia procesando productos de " + client.getName() + " ----------"
                + "\n" + "Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos");
        for (Product product : client.getShoppingCar()) {
            StaticMethods.waitXSeconds(1);
            total += product.getPrice() * product.getQuantity();
            System.out.println("Nombre: " + product.getName()
                    + "\n" + "Precio: " + product.getPrice()
                    + "  Cantidad: " + product.getQuantity()
                    + "\n" + "Producto de " + client.getName() + " procesado por " + cashier.getName()
                    + "\n" + "----------------------------");
        }
        System.out.println("Total a pagar por " + client.getName() + ": " + total + "\n"
                + "Tiempo total de compra: " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos \n"
                + "---------------------------");
    }
}
