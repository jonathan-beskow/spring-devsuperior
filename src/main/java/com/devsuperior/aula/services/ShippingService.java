package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {


    public double shipment(Order order) {
        double valorPedido = order.getBasic();
        double frete = 20.00;
        if (valorPedido >= 100.00 && valorPedido < 200.00) {
            frete = 12.00;
        } else if (valorPedido >= 200.00) {
            frete = 0.0;
        }
        return frete;
    }

}
