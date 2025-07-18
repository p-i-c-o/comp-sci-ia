/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monnickendam.com.ia;


import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author elie
 */
public class Meal implements Serializable {

    private String name;
    private String brand;
    private String type;
    private Double size;
    private String sizeType;
    private Double calories;
    private Double protein;
    private Double carbs;
    private Double fats;
    
    private String recipe;
    private LinkedList<Ingredient> IngredientList;
    

    public Meal(String name, String brand, String type, Double size, String sizeType) {
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.size = size;
        this.sizeType = sizeType;
        this.IngredientList = new LinkedList<Ingredient>();
        
    }

    public void setMacros(Double calories, Double protein, Double carbs, Double fats) {
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fats = fats;
    }
    
    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
    
    public void AddIngredient(Ingredient input) {
        this.IngredientList.add(input);
    }

    public String getName() { return name; }
    public String getBrand() { return brand; }
    public String getType() { return type; }
    public Double getSize() { return size; }
    public String getSizeType() { return sizeType; }
    public Double getCalories() { return calories; }
    public Double getProtein() { return protein; }
    public Double getCarbs() { return carbs; }
    public Double getFats() { return fats; }
}

