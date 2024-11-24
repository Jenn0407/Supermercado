package edu.iudigital.acocurrency;

import edu.iudigital.model.Cashier;
import edu.iudigital.model.Client;
import edu.iudigital.utilities.StaticMethods;

/**
 * Clase que simula el proceso de compra y cobro de productos en un supermercado
 */
public class Main {
    public static void main(String[] args) {

        //Se crean los cajeros
        Cashier cashier1 = new Cashier("Hector");
        Cashier cashier2 = new Cashier("Jaime");
        Cashier cashier3 = new Cashier("Sara");

        //Se crean los servicios del cajero
        CashierService cashierService1 = new CashierService(cashier1);
        CashierService cashierService2 = new CashierService(cashier2);
        CashierService cashierService3 = new CashierService(cashier3);

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

        //Cobro a cada cliente
        cashierService1.chargeCustomer(client1, System.currentTimeMillis());
        cashierService2.chargeCustomer(client2, System.currentTimeMillis());
        cashierService3.chargeCustomer(client3, System.currentTimeMillis());
        cashierService1.chargeCustomer(client4, System.currentTimeMillis());

    }
}
