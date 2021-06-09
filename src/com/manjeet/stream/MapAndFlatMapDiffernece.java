package com.manjeet.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 @Dish is user defined class, which have the itemType and itemCost
 */

class Dish {
    String itemType;
    Integer itemCost;

    public Dish(String itemType, Integer itemCost){
        this.itemType = itemType;
        this.itemCost = itemCost;

    }

    public Integer getItemCost(){
        return itemCost;
    }

    public String getItemType() {
        return itemType;
    }

    @Override
    public String toString(){
        return String.format(itemType + " :=> $ " + itemCost);
    }

}
public class MapAndFlatMapDiffernece {

    public static void main(String[] args) {

        List<Dish> listOfDishes = Arrays.asList(
                new Dish("Burger",300),
                new Dish("Pizza",200)
        );

        listOfDishes.stream().forEach(System.out::println);
        List<Integer> itemCostList= listOfDishes.stream().map(Dish::getItemCost).collect(Collectors.toList());
        itemCostList.forEach(System.out::println);
    }


}
