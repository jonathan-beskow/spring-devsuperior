package com.devsuperior.aula;

import com.devsuperior.aula.entities.Order;
import com.devsuperior.aula.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AulaApplication.class, args);
    }

    Order order = new Order(1034, 150.00, 20.0);
    Order order2 = new Order(2282, 800.0, 10.0);
    Order order3 = new Order(1309, 95.90, 0.0);

    @Autowired
    private OrderService orderService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println();
        System.out.printf(Locale.US, "Pedido código %d%nValor total: R$ %.2f%n", order.getCode(), orderService.total(order));
        System.out.println();
        System.out.printf(Locale.US, "Pedido código %d%nValor total: R$ %.2f%n", order2.getCode(), orderService.total(order2));
        System.out.println();
        System.out.printf(Locale.US, "Pedido código %d%nValor total: R$ %.2f%n", order3.getCode(), orderService.total(order3));
    }
}
