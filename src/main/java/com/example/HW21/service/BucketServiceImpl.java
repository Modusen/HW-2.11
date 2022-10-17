package com.example.HW21.service;

import com.example.HW21.repository.Item;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Scope("session")
public class BucketServiceImpl implements BucketService {
//    private Map<String, Item> itemsMap = new HashMap<String, Item>();
//
//    {
//        {
//            itemsMap.put("1", new Item("Стол", 15000, 1));
//            itemsMap.put("2", new Item("Стул", 10000, 2));
//            itemsMap.put("3", new Item("Диван", 60000, 3));
//            itemsMap.put("4", new Item("Кровать", 90000, 4));
//            itemsMap.put("5", new Item("Кресло", 23000, 5));
//            itemsMap.put("6", new Item("Шкаф", 44000, 6));
//        }
//    }

    ;
    public List<Item> itemList = new LinkedList<>(List.of(
            new Item("Стол", 15000, 1),
            new Item("Стул", 10000, 2),
            new Item("Диван", 60000, 3),
            new Item("Кровать", 90000, 4),
            new Item("Кресло", 23000, 5),
            new Item("Шкаф", 44000, 6)));


    HashSet<Integer> bucket = new HashSet<>();

    @Override
    public String add(HashSet<Integer> set) {
        bucket = set;
        return "Предметы с номерами: " + set + " добавлены в корзину!";
    }

    @Override
    public String get() {
        return "В корзине предметы с номерами: " + bucket.stream().sorted().collect(Collectors.toList());
    }

    @Override
    public List<Item> getItemsCart() {
        List<Item> result = new ArrayList<>();
        for (int i : bucket.stream().sorted().collect(Collectors.toList())) {
            for (Item item : itemList) {
                if (item.getId() == i) {
                    result.add(item);
                }
            }
        }
        return result;
    }

}
