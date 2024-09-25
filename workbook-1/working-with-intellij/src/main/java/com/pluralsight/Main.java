package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        String[] shoppingList = {
                "Eggs",
                "Meat",
                "Milk",
                "Bread",
                "Sugar",
                "Beef",
                "Chicken",
                "Lettuce",
                "Butter",
                "Cinnamon"
        };
        for (String food : shoppingList) {
            System.out.println(food);
        }
    }
}