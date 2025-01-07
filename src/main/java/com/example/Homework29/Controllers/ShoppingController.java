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

    private final ShoppingService shopService;

    public ShoppingController(ShoppingService shopService) {
        this.shopService = shopService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam Map<Integer, String> items) {
        return shopService.add(items);
    }

    @GetMapping(path = "/get")
    public Map<Integer,String> get(){
       return shopService.get();
    }

}
