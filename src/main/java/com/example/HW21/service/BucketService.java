package com.example.HW21.service;

import com.example.HW21.repository.Item;

import java.util.HashSet;
import java.util.List;

public interface BucketService {
    String add(HashSet<Integer> set);

    String get();

    List<Item> getItemsCart();
}
