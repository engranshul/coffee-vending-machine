package com.anshul.coffeevendingmachine.model;

import lombok.*;

import java.util.*;

@Getter
public class Ingredient {

    private String ingredientName;

    public Ingredient(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(ingredientName, that.ingredientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredientName);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientName='" + ingredientName + '\'' +
                '}';
    }
}
