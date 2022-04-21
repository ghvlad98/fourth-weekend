package com.spring.service;

import com.spring.domain.Delivery;
import com.spring.repository.DeliveryRepository;
import com.spring.service.api.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeliveryServiceImpl implements DeliveryService {
    @Autowired
    DeliveryRepository deliveryRepository;

    @Override
    public List<Delivery> findAll() {
        return deliveryRepository.findAll();
    }

    @Override
    public Optional<Delivery> getDeliveryById(long id) {
        return deliveryRepository.findById(id);
    }

    @Override
    public Delivery addDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }
}
