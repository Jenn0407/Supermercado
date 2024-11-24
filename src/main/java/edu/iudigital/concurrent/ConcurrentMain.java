package edu.iudigital.concurrent;

import edu.iudigital.model.Cashier;
import edu.iudigital.model.Client;
import edu.iudigital.utilities.StaticMethods;

/**
 * Clase que simula el proceso de compra y cobro de productos en un supermercado
 */
public class ConcurrentMain {
    public static void main(String[] args) {

        //Se crean los cajeros
        Cashier cashier1 = new Cashier("Hector");
        Cashier cashier2 = new Cashier("Jaime");
        Cashier cashier3 = new Cashier("Sara");

        //Se crean los servicios del cajero
        ConcurrentCashierService concurrentCashierService1 = new ConcurrentCashierService(cashier1);
        ConcurrentCashierService concurrentCashierService2 = new ConcurrentCashierService(cashier2);
        ConcurrentCashierService concurrentCashierService3 = new ConcurrentCashierService(cashier3);
        ConcurrentCashierService concurrentCashierService4 = new ConcurrentCashierService(cashier1);

        //Se crean los clientes
        Client client1 = new Client("Aida");
        Client client2 = new Client("Jenifer");
        Client client3 = new Client("Didier");
        Client client4 = new Client("Pepito");

        //Se agregan los productos al carrito del cliente
        client1.addProduct(StaticMethods.getProduct(0));
        client1.addProduct(StaticMethods.getProduct(2));

        client2.addProduct(StaticMethods.getProduct(2));
        client2.addProduct(StaticMethods.getProduct(3));

        client3.addProduct(StaticMethods.getProduct(4));
        client3.addProduct(StaticMethods.getProduct(1));

        client4.addProduct(StaticMethods.getProduct(0));
        client4.addProduct(StaticMethods.getProduct(1));
        client4.addProduct(StaticMethods.getProduct(2));
        client4.addProduct(StaticMethods.getProduct(3));
        client4.addProduct(StaticMethods.getProduct(4));

        //Se le cobra al cliente
        concurrentCashierService1.chargeCustomer(client1, System.currentTimeMillis());
        concurrentCashierService2.chargeCustomer(client2, System.currentTimeMillis());
        concurrentCashierService3.chargeCustomer(client3, System.currentTimeMillis());
        concurrentCashierService4.chargeCustomer(client4, System.currentTimeMillis());


    }
}
