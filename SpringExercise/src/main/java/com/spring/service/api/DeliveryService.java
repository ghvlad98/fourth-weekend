package com.spring.service.api;

import com.spring.domain.Delivery;

import java.util.List;
import java.util.Optional;

public interface DeliveryService {
    public List<Delivery> findAll();
    public Optional<Delivery> getDeliveryById(long id);
    public Delivery addDelivery(Delivery delivery);
}
