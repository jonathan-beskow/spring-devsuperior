package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public double total(Order order) {
        double valorPedido = order.getBasic();
        double discount = order.getDiscount();
        valorPedido *= (1 - discount / 100);
        valorPedido += shippingService.shipment(order);
        return valorPedido;

    }

}
