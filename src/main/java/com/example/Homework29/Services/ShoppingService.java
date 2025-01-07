package com.example.Homework29.Services;


import com.example.Homework29.OrderService;
import com.example.Homework29.model.ShoppingСart;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service

public class ShoppingService implements OrderService {

    private ShoppingСart shoppingСart;                                       // создаётся объект корзины

    public ShoppingService(ShoppingСart shoppingСart) {                      // создаётся конструктор корзины
        this.shoppingСart = shoppingСart;
    }

    private HashMap<Integer, String> goods;

    public ShoppingService() {

        this.goods = new HashMap<Integer, String>();
    }


    @Override
    public String add(Map<Integer, String> order) {                       // инжектятся методы интерфейса add
        shoppingСart.addOrder(order);                                             // добавление товара в корзину
        return "succesfully added";
    }

    @Override
    public Map<Integer, String> get() {                                           // инжектятся методы сервиса get
        return shoppingСart.getOrder();
    }


//    public Goods getItem(Integer getID) {
//        return goods.get(goods);
//    }

//    public void addItem (Goods good){
//        goods.put(good.getName(),good);
//        shoppingСart.addOrder();
//    }
}

