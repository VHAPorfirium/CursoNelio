package Aula_Seccao12.Enumeração.application;

import Aula_Seccao12.Enumeração.entities.Order;
import Aula_Seccao12.Enumeração.entities.OrderStatus;

import java.util.Date;

public class program {
    public static void main(String[] args) {


        Order oder = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(oder);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println();
        System.out.println(os2);

    }
}
