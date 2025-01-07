package com.example.Homework29.model;


import java.util.Map;

public class Goods {                                        //создание класса объектов товаров

    private Map<Integer, String> goods;                     // создание экземпляра класса

    private String name;
    private int ID;

    public Goods(int ID, String name) {                     //конструктор
        this.name = name;
        this.ID = ID;
    }


    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "goods{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

    public void allGoods() {                            //пример списка товаров
        goods.put(1, "картошка");
        goods.put(22, "морковка");
        goods.put(321, "помидор");
        goods.put(4321, "кетчуп");
    }

}
