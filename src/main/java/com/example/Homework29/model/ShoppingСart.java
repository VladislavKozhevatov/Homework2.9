package com.example.Homework29.model;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.Map;

@Component
@SessionScope                                                          //ставим аннотацию для разделения сессий
public class ShoppingСart {                                            //создаём объёкт корзину с покупками

public  Map <Integer, String> order;                                    // Форму заказа хочу создать через MaP (где ключ int ID , но так же есть и значение объекта String


    public void addOrder (Map<Integer,String> order){                   //метод для добавления заказа
        order.putAll(order);
    }

    public Map<Integer,String> getOrder() {                             // метод для получения заказа в корзине.
        return order;
    }


    public void setOrder(Map<Integer, String> order) {
        this.order = order;
    }
}
