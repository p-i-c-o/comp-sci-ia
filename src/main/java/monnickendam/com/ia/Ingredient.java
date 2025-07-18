/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monnickendam.com.ia;

import java.io.Serializable;

/**
 *
 * @author elie
 */
public class Ingredient implements Serializable {
    private String name;
    private Double quantity;
    private String quantityType;
    
    public Ingredient(String name, Double quantity, String quantityType) {
        this.name = name;
        this.quantity = quantity;
        this.quantityType = quantityType;
    }
    
    public String getName() { return this.name; }
    public Double getQuantity() { return this.quantity; }
    public String getQuantityType() { return this.quantityType; }
}
