package com.Nest1.teashop;

public class Fooditems {
    Integer Tea,Coffee,Cake,Sweets,IceCream;

    public Fooditems(Integer tea, Integer coffee, Integer cake, Integer sweets, Integer iceCream) {
        Tea = tea;
        Coffee = coffee;
        Cake = cake;
        Sweets = sweets;
        IceCream = iceCream;
    }

    public Integer getTea() {
        return Tea;
    }

    public Integer getCoffee() {
        return Coffee;
    }

    public Integer getCake() {
        return Cake;
    }

    public Integer getSweets() {
        return Sweets;
    }

    public Integer getIceCream() {
        return IceCream;
    }
}
