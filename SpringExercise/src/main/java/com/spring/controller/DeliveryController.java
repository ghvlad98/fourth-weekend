package com.spring.controller;

import com.spring.domain.Delivery;
import com.spring.service.api.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

    @Autowired
    DeliveryService deliveryService;

    @GetMapping("/")
    ResponseEntity<List<Delivery>> findAll() {
        return new ResponseEntity<>(deliveryService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Delivery> getDeliveryById(@PathVariable long id) {
        return new ResponseEntity<Delivery>(deliveryService.getDeliveryById(id).get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Delivery> createDelivery(@RequestBody Delivery delivery) {
        return new ResponseEntity<Delivery>(deliveryService.addDelivery(delivery), HttpStatus.OK);
    }
}
