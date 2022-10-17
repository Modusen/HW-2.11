package com.example.HW21.controller;

import com.example.HW21.repository.Item;
import com.example.HW21.service.BucketService;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;

@RestController
@Scope("session")
@RequestMapping(path = "/store/order")
public class BucketController {
    private final BucketService bucketService;

    public BucketController(BucketService bucketService) {
        this.bucketService = bucketService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam ("item") HashSet<Integer> itemIDs) {
        return bucketService.add(itemIDs);
    }
    @GetMapping(path = "/get")
    public String get() {
        return bucketService.get();
    }
    @GetMapping(path = "/itemsCart")
    public List<Item> getItemsCart() {
        return bucketService.getItemsCart();
    }

}
