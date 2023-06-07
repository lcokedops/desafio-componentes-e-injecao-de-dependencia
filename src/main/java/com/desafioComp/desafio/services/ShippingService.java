package com.desafioComp.desafio.services;

import com.desafioComp.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        double shipmentTax = 20.0;

        if (order.getBasic() < 200.0 && order.getBasic() >= 100.0) {
            shipmentTax = 12.0;
        } else if (order.getBasic() >= 200.0) {
            shipmentTax = 0.0;
        }

        return shipmentTax;
    }
}
