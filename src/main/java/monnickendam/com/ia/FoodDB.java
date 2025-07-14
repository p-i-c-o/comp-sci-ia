/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monnickendam.com.ia;
import java.util.LinkedList;
import java.util.ArrayList;
import java.io.Serializable;

/**
 *
 * @author elie
 */
public class FoodDB implements Serializable {
    private LinkedList<Meal> ListDB;
    private int ItemCount;
    private int MealCount;
    private int DrinkCount;
    private int SnackCount;
    
            
    public FoodDB() {
        this.ListDB = new LinkedList<>();
        this.ItemCount = 0;
        this.MealCount = 0;
        this.DrinkCount = 0;
        this.SnackCount = 0;
    }
    
    public void add(Meal input_meal) {
        
        switch (input_meal.getType()) {
            case "Drink" -> this.DrinkCount++;
            case "Meal"  -> this.MealCount++;
            case "Snack" -> this.SnackCount++;
            default      -> System.out.println("Unknown type: " + input_meal.getType());
        }
        
        this.ItemCount++;

        this.ListDB.add(input_meal);
    }
    
    public LinkedList<Meal> getAllMeals() {
        return ListDB;
    }
    
    public int getItemCount() {
        return ItemCount;
    }

    public int getMealCount() {
        return MealCount;
    }

    public int getDrinkCount() {
        return DrinkCount;
    }

    public int getSnackCount() {
        return SnackCount;
    }


}
