package com.example.Homework29.Controllers;


import com.example.Homework29.model.Goods;
import com.example.Homework29.Services.ShoppingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/store/order")
public class ShoppingController {

    private ShoppingService shopService;

    public ShoppingController (ShoppingService shopService){
        this.shopService = shopService;
    }

    @GetMapping(path = "/add")
    public String addItem (@RequestParam int ID, @RequestParam String name){
     return shopService.add(ID,name);                                                 // не могу додумать что должно быть в поле
    }

    @GetMapping(path = "/get")
    public Goods getItem(@RequestParam int ID){
     shopService.get();
     return (Goods) Map.of();
    }
}
